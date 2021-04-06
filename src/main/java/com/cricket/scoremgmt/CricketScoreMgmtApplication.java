package com.cricket.scoremgmt;




import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.core.io.Resource;



@SpringBootApplication
@MapperScan("com.cricket.scoremgmt.mapper")
public class CricketScoreMgmtApplication {
	
	@Value("classpath:mybatis-config.xml")
	private Resource mybatisResource;
	
	
	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory( DataSource sqlServerDataSource) throws Exception{
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(sqlServerDataSource);
		//bean.setConfigLocation(mybatisResource);
		return bean;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(CricketScoreMgmtApplication.class, args);
	}

}
