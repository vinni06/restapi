package com.mindtree.channel.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.channel.dto.ChannelDto;
import com.mindtree.channel.entity.Channel;
import com.mindtree.channel.entity.ChannelGroup;
import com.mindtree.channel.exceptions.NoSuchChannelGroupFound;
import com.mindtree.channel.exceptions.ServiceException;
import com.mindtree.channel.repository.ChannelGroupRepository;
import com.mindtree.channel.repository.ChannelRepository;
import com.mindtree.channel.repository.ShowRepository;
import com.mindtree.channel.service.ChannelService;

@Service
public class ChannelServiceImpl implements ChannelService {
	
	@Autowired
	ChannelRepository channelRepositoryObj;
	
	@Autowired
	ChannelGroupRepository channelGroupRepositoryObj;
	
	@Autowired
	ShowRepository showRepositoryObj;
	
	ModelMapper mapper=new ModelMapper();

	@Override
	public ChannelDto addChannel(ChannelDto channelDto,int groupId) throws ServiceException {
		Channel channel = mapper.map(channelDto, Channel.class);
		if(channelGroupRepositoryObj.existsById(groupId)) {
			ChannelGroup channelGroup=channelGroupRepositoryObj.getOne(groupId);
			channel.setChannelGroup(channelGroup);
			Channel savedChannel=channelRepositoryObj.save(channel);
			return mapper.map(savedChannel,ChannelDto.class);
		}else {
			throw new NoSuchChannelGroupFound("no such channel group found");
		}
		
			
		
	
	}

	@Override
	public List<ChannelDto> sortByGroup(int groupId) {
		ChannelGroup channelGroup=channelGroupRepositoryObj.getOne(groupId);
		List<Channel> channelList=channelGroup.getChannels();
		Collections.sort(channelList);
		List<ChannelDto> channelsdto=channelList.stream().map(entity->mapper.map(entity, ChannelDto.class)).collect(Collectors.toList());
//		for(int i =0;i<channelList.size();i++ ) {
//			channelsdto.add(mapper.map(channelList.get(i), ChannelDto.class));
//		}
		return channelsdto;
	}

}
