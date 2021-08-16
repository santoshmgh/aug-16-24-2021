package com.intuit;

public class Person {
	
	private String name;
	private Car car;
	
	public Person() {
		System.out.println("**Person created");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
}
