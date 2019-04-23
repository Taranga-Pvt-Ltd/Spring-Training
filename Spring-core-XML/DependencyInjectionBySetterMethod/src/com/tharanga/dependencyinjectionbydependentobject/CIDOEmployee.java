package com.tharanga.dependencyinjectionbydependentobject;

public class CIDOEmployee {
	
	private int id;  
	private String name;  
	private CIDOAddress address;//Aggregation  
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
	public CIDOAddress getAddress() {
		return address;
	}
	public void setAddress(CIDOAddress address) {
		this.address = address;
	}
	
	void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address);  
	}  
	  
	
}
