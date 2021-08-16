package com.intuit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//Person p1 = PersonFactory.getPersonWithCar();
		
		//This is our container
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
		Person p1 = context.getBean("person", Person.class);
		System.out.println(p1.getName());
		System.out.println(p1.getCar().getModel());
	}

}
