package com.malli.SprinDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SprinDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinDemoApplication.class, args);
	}

}
