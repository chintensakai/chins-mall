package com.chins.chinsmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.chins.chinsmall.product.mapper")
@EnableDiscoveryClient
public class ChinsmallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChinsmallProductApplication.class, args);
	}

}
