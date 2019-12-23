package com.mindtree.channel.service;

import com.mindtree.channel.dto.ShowDto;
import com.mindtree.channel.exceptions.ServiceException;

public interface ShowService {

	public ShowDto addShows(ShowDto showDto, int channelId) throws ServiceException;

	

}
