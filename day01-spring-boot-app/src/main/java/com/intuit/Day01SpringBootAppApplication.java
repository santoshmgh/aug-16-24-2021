package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.someother")
public class Day01SpringBootAppApplication 
		implements CommandLineRunner {

	@Autowired
	private Company company;
	
	public static void main(String[] args) {
		SpringApplication.run(Day01SpringBootAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("****" + company.getName());
		
	}
	
	

}
