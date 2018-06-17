package com.gj.bos_resopse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BosResopseApplication {

	public static void main(String[] args) {
		SpringApplication.run(BosResopseApplication.class, args);
	}
}
