package com.springnamedjdbc;

public class Emp {
	private int id;  
	private String name;
	private double salary;  

	public Emp()
	{
		
	}
	
	public Emp(int id, String name,double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double d) {
		this.salary = d;
	}

	
	
}
