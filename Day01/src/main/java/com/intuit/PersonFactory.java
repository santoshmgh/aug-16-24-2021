package com.intuit;

//CREATION CODE
//Avoid it using Spring
public class PersonFactory {

	public static Person getPersonWithCar() {
		Person person = new Person();
		person.setName("Sam");
		Car bmw = new Car();
		bmw.setModel("BMW");
		person.setCar(bmw);
		return person;
	}
}
