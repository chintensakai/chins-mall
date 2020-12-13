package com.chins.chinsmall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.chins.chinsmall.order.mapper")
@EnableDiscoveryClient
public class ChinsmallOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChinsmallOrderApplication.class, args);
	}

}
