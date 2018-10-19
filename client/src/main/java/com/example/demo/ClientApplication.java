package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {
	//分布式配置 client
	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
}
