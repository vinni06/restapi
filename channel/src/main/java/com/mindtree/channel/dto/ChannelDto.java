package com.mindtree.channel.dto;

import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class ChannelDto {
	
	private int channelId;
	private String channelName;
	private int price;
	
	private List<ShowDto> shows;
	public ChannelDto() {
		super();
	}
	public ChannelDto(int channelId, String channelName, int price, List<ShowDto> shows) {
		super();
		this.channelId = channelId;
		this.channelName = channelName;
		this.price = price;
		this.shows = shows;
	}
	public int getChannelId() {
		return channelId;
	}
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List<ShowDto> getShows() {
		return shows;
	}
	public void setShows(List<ShowDto> shows) {
		this.shows = shows;
	}
	@Override
	public String toString() {
		return "ChannelDto [channelId=" + channelId + ", channelName=" + channelName + ", price=" + price + ", shows="
				+ shows + "]";
	}


}
