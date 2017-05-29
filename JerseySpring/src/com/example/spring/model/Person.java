package com.example.spring.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {
	
	
	private String name;
	
	@NotNull
	@Size(min=1, max=5)
	private String lastName;
	
	@NotNull
	@Min(1)
	@Max(2)
	private int age;
	
	public Person(){
		
	}

	public Person(String name, String lastName, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	@NotNull(message = "name cannot be null")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
