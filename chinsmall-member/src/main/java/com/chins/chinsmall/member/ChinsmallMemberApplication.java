package com.chins.chinsmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.chins.chinsmall.member.mapper")
@EnableFeignClients("com.chins.chinsmall.member.feign")
@EnableDiscoveryClient
public class ChinsmallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChinsmallMemberApplication.class, args);
	}

}
