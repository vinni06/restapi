package com.mindtree.channel.dto;

public class ShowDto {
	private int showId;
	private String showName;
	public ShowDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShowDto(int showId, String showName) {
		super();
		this.showId = showId;
		this.showName = showName;
	}
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	@Override
	public String toString() {
		return "ShowDto [showId=" + showId + ", showName=" + showName + "]";
	}
	
}
