package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulApplication {
	//网关服务启动类
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
		System.out.println("++++++++++++++++++网关服务启动成功++++++++++++++++++++++++");
	}
}
