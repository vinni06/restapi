package com.mindtree.channel.service;

import java.util.List;

import com.mindtree.channel.dto.ChannelDto;
import com.mindtree.channel.dto.ShowDto;
import com.mindtree.channel.exceptions.ServiceException;

public interface ChannelService {

	public ChannelDto addChannel(ChannelDto channelDto, int groupId) throws ServiceException;

	public List<ChannelDto> sortByGroup(int groupId);


}
