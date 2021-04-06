package com.cricket.scoremgmt.domain;

public class Batsman {
	private String batsmanName;
	private int batsmanScore;
	private String teamName;
	private int batsmanNo;
	
	public int getBatsmanNo() {
		return batsmanNo;
	}
	public void setBatsmanNo(int batsmanNo) {
		this.batsmanNo = batsmanNo;
	}
	public String getBatsmanName() {
		return batsmanName;
	}
	public void setBatsmanName(String batsmanName) {
		this.batsmanName = batsmanName;
	}
	public int getBatsmanScore() {
		return batsmanScore;
	}
	public void setBatsmanScore(int batsmanScore) {
		this.batsmanScore = batsmanScore;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	

}
