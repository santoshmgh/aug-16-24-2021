package com.intuit.lab01;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//<bean id="mathOperations" class="">
//<util:list><value>add</value><value>subtract</value></util:list>

@Configuration
public class AppConfiguration {
	
	@Bean("mathOps")
	public List<String> getMathOperations() {
		return Arrays.asList("add", "subtract", "square");
	}
}
