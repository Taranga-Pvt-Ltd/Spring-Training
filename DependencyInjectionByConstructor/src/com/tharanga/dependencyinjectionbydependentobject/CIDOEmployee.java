package com.tharanga.dependencyinjectionbydependentobject;

public class CIDOEmployee {
	
	private int id;  
	private String name;  
	private CIDOAddress address;//Aggregation  
	  
	public CIDOEmployee() {System.out.println("def cons");}  
	  
	public CIDOEmployee(int id, String name, CIDOAddress address) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	}  
	  
	void show(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address.toString());  
	}  

}
