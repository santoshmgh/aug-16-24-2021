package com.intuit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Lab02Configuration {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
