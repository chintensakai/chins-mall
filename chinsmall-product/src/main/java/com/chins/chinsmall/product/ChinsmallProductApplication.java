package com.chins.chinsmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chins.chinsmall.product.mapper")
public class ChinsmallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChinsmallProductApplication.class, args);
	}

}
