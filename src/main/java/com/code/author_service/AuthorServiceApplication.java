package com.code.author_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoRepositories
@EnableFeignClients
public class AuthorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorServiceApplication.class, args);
	}

}
