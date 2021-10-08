package com.investigacion.spring.mongo.api;


import org.springframework.boot.SpringApplication;
import org.springframework.web.client.RestTemplate;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class ProyectoInvestigacionApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoInvestigacionApplication.class, args);
	}
    @Bean
	private RestTemplate restTemplate() {
		
		return new RestTemplate();
	}

}
