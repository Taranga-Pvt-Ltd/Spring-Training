package com.tharanga.nonstaticfactorymethod;

public class PrintableFactory {
	
	public  Printable getPrintable()
	{
		return new B();  //return any one instance A or B
	}

}
