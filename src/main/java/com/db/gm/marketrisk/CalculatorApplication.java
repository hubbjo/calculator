package com.db.gm.marketrisk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CalculatorApplication {

	final static Logger LOG = LoggerFactory.getLogger(CalculatorApplication.class);
	
	@Bean
	void showMessage() {
		LOG.info("Hi From the calculator application");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

}
