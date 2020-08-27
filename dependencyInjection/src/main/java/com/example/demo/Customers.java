package com.example.demo;

import org.springframework.stereotype.Component;

@Component

public class Customers {
	
	private int id;
	private String name;
	private String courseName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void display() {
		System.out.println("Object is Created successfully");
	}
	
	

}
