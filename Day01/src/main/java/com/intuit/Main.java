package com.intuit;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//Person p1 = PersonFactory.getPersonWithCar();
		
		//This is our container
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
		
//		Person p1 = context.getBean("person", Person.class);

//		System.out.println(p1.getName());
//		System.out.println(p1.getCar().getModel());
		Person p2 = context.getBean("person2", Person.class);
//		System.out.println(p2.getName() + ", " + p2.getCar());
		System.out.println(p2);
		Person p3 = context.getBean("person2", Person.class);
		System.out.println(p3);
		Person p4 = context.getBean("person2", Person.class);
		System.out.println(p4);
		
		List<String> books = context.getBean("books", List.class);
		System.out.println(books);

		Employee e = context.getBean("employee2", Employee.class);
		System.out.println(e.getId() + ", " + e.getName());
		
	}

}
