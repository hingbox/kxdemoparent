package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {
	//分布式配置server
	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
}
