package com.tharanga.dependencyinjectionbydependentobject;

public class CIDOAddress {
	
	private String city;  
	private String state;  
	private String country;  
	  
	public CIDOAddress(String city, String state, String country) {  
	    super();  
	    this.city = city;  
	    this.state = state;  
	    this.country = country;  
	}  
	  
	public String toString(){  
	    return city+" "+state+" "+country;  
	}  

}
