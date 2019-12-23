package com.mindtree.channel.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Channel implements Comparable<Channel> {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int channelId;
	private String channelName;
	private int price;
	@ManyToOne(cascade = CascadeType.ALL)
	private ChannelGroup channelGroup;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "channel")
	private List<Shows> shows;
	public Channel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Channel(int channelId, String channelName, int price, ChannelGroup channelGroup, List<Shows> shows) {
		super();
		this.channelId = channelId;
		this.channelName = channelName;
		this.price = price;
		this.channelGroup = channelGroup;
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
	public ChannelGroup getChannelGroup() {
		return channelGroup;
	}
	public void setChannelGroup(ChannelGroup channelGroup) {
		this.channelGroup = channelGroup;
	}
	public List<Shows> getShows() {
		return shows;
	}
	public void setShows(List<Shows> shows) {
		this.shows = shows;
	}
	@Override
	public String toString() {
		return "Channel [channelId=" + channelId + ", channelName=" + channelName + ", price=" + price
				+ ", channelGroup=" + channelGroup + ", shows=" + shows + "]";
	}
	@Override
	public int compareTo(Channel ch) {
		if(this.price==ch.getPrice()) {
			return this.channelName.compareTo(ch.getChannelName()); 
		}else if(this.price>ch.getPrice()) {
			return 1;
		}else {
			return -1;
		}
	}
	
}
