package com.intuit.latest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LatestMain {

	public static void main(String[] args) {
		ApplicationContext context 
			= new FileSystemXmlApplicationContext("classpath:latest.xml");
		
		Company company = context.getBean("company", Company.class);
		System.out.println(company.getName());
		System.out.println(company.getHeadOffice().getCity());
		System.out.println(company.getFounder());
		System.out.println(company);
		Company company2 = context.getBean("company", Company.class);
		System.out.println(company2);
	}

}
