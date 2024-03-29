package com.jenkins.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringjenkinsintegrationApplication {
	
	public static Logger  log = LoggerFactory.getLogger(SpringjenkinsintegrationApplication.class);
	
	@PostConstruct
	public void intt() {
		log.info("Application started .......!");
	}

	public static void main(String[] args) {
		log.info("Application executed ....! ");
		SpringApplication.run(SpringjenkinsintegrationApplication.class, args);
	}

}
