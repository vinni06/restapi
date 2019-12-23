package com.mindtree.channel.dto;

import java.util.List;


public class ChannelGroupDto {
	private int groupId;
	private String groupName;
	private List<ChannelDto> channels;
	public ChannelGroupDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChannelGroupDto(int groupId, String groupName, List<ChannelDto> channels) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.channels = channels;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public List<ChannelDto> getChannels() {
		return channels;
	}
	public void setChannels(List<ChannelDto> channels) {
		this.channels = channels;
	}
	@Override
	public String toString() {
		return "ChannelGroupDto [groupId=" + groupId + ", groupName=" + groupName + ", channels=" + channels + "]";
	}
	
	
	
}
