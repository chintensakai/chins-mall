package com.chins.chinsmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.chins.chinsmall.coupon.mapper")
@EnableDiscoveryClient
public class ChinsmallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChinsmallCouponApplication.class, args);
	}

}
