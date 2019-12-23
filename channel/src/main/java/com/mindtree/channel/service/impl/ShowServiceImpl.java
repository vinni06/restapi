package com.mindtree.channel.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.channel.dto.ShowDto;
import com.mindtree.channel.entity.Channel;
import com.mindtree.channel.entity.Shows;
import com.mindtree.channel.exceptions.NoSuchChannelPresent;
import com.mindtree.channel.exceptions.ServiceException;
import com.mindtree.channel.repository.ChannelGroupRepository;
import com.mindtree.channel.repository.ChannelRepository;
import com.mindtree.channel.repository.ShowRepository;
import com.mindtree.channel.service.ShowService;

@Service
public class ShowServiceImpl implements ShowService {

	@Autowired
	ChannelRepository channelRepositoryObj;
	
	@Autowired
	ChannelGroupRepository channelGroupRepositoryObj;
	
	@Autowired
	ShowRepository showRepositoryObj;
	
	ModelMapper mapper=new ModelMapper();
	@Override
	public ShowDto addShows(ShowDto showDto, int channelId) throws ServiceException {
		Shows shows=mapper.map(showDto, Shows.class);
		if(channelRepositoryObj.existsById(channelId))
		{
			Channel channel=channelRepositoryObj.getOne(channelId);
			shows.setChannel(channel);
			Shows savedshows=showRepositoryObj.save(shows);
			return mapper.map(savedshows, ShowDto.class);
		}
		else
		{
			throw new NoSuchChannelPresent("No such channel present");
		}
		
	}

}
