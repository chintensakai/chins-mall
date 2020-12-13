package com.chins.chinsmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chins.chinsmall.member.mapper")
public class ChinsmallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChinsmallMemberApplication.class, args);
	}

}
