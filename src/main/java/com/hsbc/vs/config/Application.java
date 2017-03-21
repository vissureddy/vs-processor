package com.hsbc.vs.config;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	private static Logger log = Logger.getLogger(Application.class);

    public static void main(String[] args) {
    	log.info("Start - Initializing the SpringBoot Application");
    	SpringApplication.run(Application.class, args);
    	log.info("Completed - Initializing the SpringBoot Application");
    }
}