package com.cricket.scoremgmt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.cricket.scoremgmt.domain.Batsman;
import com.cricket.scoremgmt.domain.Team;
@Mapper
public interface ScoreMapper {
	
	public List<Team>findAll();
	
	public List<Batsman>getBatmanDetails();
	
	@Insert("insert into [mysqlTestDB].[dbo].[Batsman]"
			+ "values(#{bats.batsmanNo},#{bats.teamName},#{bats.batsmanName},#{bats.batsmanScore})")
	public int addBatsmanDetails(@Param("bats")Batsman bats);
	
	@Insert("insert into [mysqlTestDB].[dbo].[Team]"
			+ "values(#{team.teamName},#{team.totalRuns},#{team.teamAverage})")
	public int addTeamDetails(@Param("team")Team team);
	
	public List<Team>calculateAvg();
	
	@Delete("delete [mysqlTestDB].[dbo].[Team]")
	public int deleteTeamDetails();
	
	@Update("update [mysqlTestDB].[dbo].[Batsman] set Batsman_score=#{score} where [BatsmanNo]=${batsmanNo}")
	public int updateScore(@Param("batsmanNo")int batsmanNo,@Param("score")int score);
	
	@Delete("delete [mysqlTestDB].[dbo].[Batsman] where [BatsmanNo]=#{batsmanNo} ")
	public int deleteBatsmanDetails(@Param("batsmanNo")int batsmanNo);

}
