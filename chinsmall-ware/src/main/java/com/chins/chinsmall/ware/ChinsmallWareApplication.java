package com.chins.chinsmall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.chins.chinsmall.ware.mapper")
@EnableDiscoveryClient
public class ChinsmallWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChinsmallWareApplication.class, args);
	}

}
