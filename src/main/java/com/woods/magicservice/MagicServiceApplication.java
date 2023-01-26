package com.woods.magicservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableAutoConfiguration
@EnableFeignClients
@SpringBootApplication
public class MagicServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagicServiceApplication.class, args);
	}
}
