package com.mindtree.channel.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.channel.dto.ChannelGroupDto;
import com.mindtree.channel.entity.ChannelGroup;
import com.mindtree.channel.repository.ChannelGroupRepository;
import com.mindtree.channel.repository.ChannelRepository;
import com.mindtree.channel.repository.ShowRepository;
import com.mindtree.channel.service.ChannelGroupService;

@Service
public class ChannelGroupServiceImpl implements ChannelGroupService {
	@Autowired
	ChannelRepository channelRepositoryObj;
	
	@Autowired
	ChannelGroupRepository channelGroupRepositoryObj;
	
	@Autowired
	ShowRepository showRepositoryObj;
	
	ModelMapper mapper=new ModelMapper();
	@Override
	public ChannelGroupDto addChannelGroupDto(ChannelGroupDto channelGroupDto) {
		
		ChannelGroup channelGroup=mapper.map(channelGroupDto, ChannelGroup.class);
		ChannelGroup savedChannelGroup=channelGroupRepositoryObj.save(channelGroup);
		return mapper.map(savedChannelGroup, ChannelGroupDto.class);
	}

}
