package com.cricket.scoremgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.scoremgmt.domain.Batsman;
import com.cricket.scoremgmt.domain.Team;
import com.cricket.scoremgmt.service.ScoreMgmtService;
@RestController
@RequestMapping("/score")
public class ScoreMgmtController {
	@Autowired
	private ScoreMgmtService scoreService;
	
	@GetMapping("/getTeamDetails")
	public List<Team>getTeamDetails(){
		List<Team>teamList = scoreService.getTeamDetails();
		return teamList;
	}
	
	@PostMapping("/addBatsmanDetail")
	public String addBatsmanDetails(@RequestBody List<Batsman> batsman){
		String status = scoreService.addBatsmanDetails(batsman);
		return status;
	}
	
	@PutMapping("/updateBatsman/{batsmanNo}/{score}")
	public String updateBatsmanDetails(@PathVariable int batsmanNo,@PathVariable int score){
		String status = scoreService.updateScore(batsmanNo,score);
		return status;
	}
	@DeleteMapping("/deleteBtasman")
	public String deleteBatsman(@RequestParam("batsmanNo")int batsmanNo){
		String status  = scoreService.deleteBatsman(batsmanNo);
		return status;
	}

}
