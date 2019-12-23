package com.mindtree.channel.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ChannelGroup {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int groupId;
	private String groupName;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "channelGroup")
	private List<Channel> channels;
	public ChannelGroup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChannelGroup(int groupId, String groupName, List<Channel> channels) {
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
	public List<Channel> getChannels() {
		return channels;
	}
	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}
	@Override
	public String toString() {
		return "ChannelGroup [groupId=" + groupId + ", groupName=" + groupName + ", channels=" + channels + "]";
	}
	
	
	
}
