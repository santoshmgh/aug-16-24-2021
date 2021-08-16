package com.intuit.latest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope("prototype")
public class Company {

	@Value("TBA")
	private String name;
	
	@Autowired
	private Location headOffice;
	
	@Autowired
	@Qualifier("founder")
	private Employee founder;
	
	@Autowired
	@Qualifier("president")
	private Employee firstEmployee;
	
	

	public Employee getFirstEmployee() {
		return firstEmployee;
	}

	public void setFirstEmployee(Employee firstEmployee) {
		this.firstEmployee = firstEmployee;
	}

	public Employee getFounder() {
		return founder;
	}

	public void setFounder(Employee founder) {
		this.founder = founder;
	}

	public Location getHeadOffice() {
		return headOffice;
	}

	public void setHeadOffice(Location headOffice) {
		this.headOffice = headOffice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
