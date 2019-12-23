package com.mindtree.channel.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mindtree.channel.exceptions.ChannelApplicationException;
import com.mindtree.channel.exceptions.ErrorMessage;


@RestControllerAdvice
public class ControllerHandler {
	
	@ExceptionHandler(ChannelApplicationException.class)
	public ResponseEntity<ErrorMessage> getErrorMessage(ChannelApplicationException e)
	{
	
	ErrorMessage errorObj=new ErrorMessage(e.getMessage());
	return new ResponseEntity<ErrorMessage>(errorObj,new HttpHeaders(),HttpStatus.BAD_REQUEST);
	}

}
