package com.mindtree.channel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.channel.dto.ChannelDto;
import com.mindtree.channel.dto.ChannelGroupDto;
import com.mindtree.channel.dto.ShowDto;
import com.mindtree.channel.exceptions.ChannelApplicationException;
import com.mindtree.channel.exceptions.ServiceException;
import com.mindtree.channel.service.ChannelGroupService;
import com.mindtree.channel.service.ChannelService;
import com.mindtree.channel.service.ShowService;

@RestController
public class AppController {
	
	@Autowired
	ChannelService channelServiceObj;
	
	@Autowired
	ChannelGroupService channelGroupServiceObj;
	
	@Autowired
	ShowService showServiceObj;
	
	@RequestMapping("/insertChannelGroup")
	public ChannelGroupDto addChannelGroupDto(@RequestBody ChannelGroupDto channelGroupDto)
	{
		
		return channelGroupServiceObj.addChannelGroupDto(channelGroupDto);
		
	}
	
	@RequestMapping("/insertChannel/{groupId}")
	public ChannelDto addChannel(@RequestBody ChannelDto channelDto,@PathVariable int groupId) throws ChannelApplicationException
	{
		
			return channelServiceObj.addChannel(channelDto,groupId);
		
		
	}
	@RequestMapping("/insertshows/{channelId}")
	public ShowDto addShows(@RequestBody ShowDto showDto,@PathVariable int channelId) throws ChannelApplicationException
	{
		return showServiceObj.addShows(showDto,channelId);
		
	}
	
	@GetMapping("/sort/{groupId}")
	public List<ChannelDto> sort(@PathVariable int groupId)
	{
		
		return channelServiceObj.sortByGroup(groupId);
		
	}
	
	
	
	

}
