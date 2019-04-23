package com.tharanga;

public class Employee {
	
	private int id;
	private String name;
	
	Employee()
	{
		System.out.println("Indide Constructor");
	}
	
	public Employee(int id)
	{
		this.id=id;
	}
	public Employee(String name)
	{
		this.name=name;
	}
	public Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public void display()
	{
		System.out.println( id+" "+name);
	}

}
