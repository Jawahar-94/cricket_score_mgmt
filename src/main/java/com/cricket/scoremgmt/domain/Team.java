package com.cricket.scoremgmt.domain;

import java.util.List;

public class Team {
	private String teamName;
	private int totalRuns;
	private int teamAverage;
	private List<Batsman> batsmanList;
	
	
	public List<Batsman> getBatsmanList() {
		return batsmanList;
	}
	public void setBatsmanList(List<Batsman> batsmanList) {
		this.batsmanList = batsmanList;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getTotalRuns() {
		return totalRuns;
	}
	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}
	public int getTeamAverage() {
		return teamAverage;
	}
	public void setTeamAverage(int teamAverage) {
		this.teamAverage = teamAverage;
	}
	
	
	
	

}
