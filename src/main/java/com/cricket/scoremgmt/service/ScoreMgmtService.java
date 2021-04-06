package com.cricket.scoremgmt.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.scoremgmt.domain.Batsman;
import com.cricket.scoremgmt.domain.Team;
import com.cricket.scoremgmt.mapper.ScoreMapper;

@Service
public class ScoreMgmtService {
	@Autowired
	private ScoreMapper score;
	
	public List<Team>getTeamDetails(){
		List<Team>teamList = score.findAll();
		return teamList;
	}
	
	public String addBatsmanDetails(List<Batsman> batsman){
		String status;
		int value=0;
		
		for(Batsman batsmanDetail : batsman){
		 value = score.addBatsmanDetails(batsmanDetail);
		}
		String teamStatus = insertTeamAverage();
		if(value==1){
			status = "batsman details inserted successfully";
		}
		else{
			status = "Insert failed";
		}
		return status;
	}
	public String insertTeamAverage(){
		String status;
		int value=0;
		score.deleteTeamDetails();
		List<Team>listTeam = score.calculateAvg();
		for(Team team : listTeam){
			value = score.addTeamDetails(team);
		}
		if(value==1){
			status = "Team details inserted successfully";
		}
		else{
			status = "Insert failed";
		}
		return status;
	}
	public String updateScore(int batsmanNo,int batsmanScore){
		String status;
		int value=0;
		value = score.updateScore(batsmanNo,batsmanScore);
		insertTeamAverage();
		if(value==1){
			status = "Batsman score successfully updated";
		}
		else{
			status = "Update failed";
		}
		return status;
	}
	public String deleteBatsman(int batsmanNo){
		String status;
		int value=0;
		value = score.deleteBatsmanDetails(batsmanNo);
		insertTeamAverage();
		if(value==1){
			status = "Batsman score successfully Deleted";
		}
		else{
			status = "Delete failed";
		}
		return status;
	}

}
