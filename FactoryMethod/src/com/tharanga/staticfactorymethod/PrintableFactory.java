package com.tharanga.staticfactorymethod;

public class PrintableFactory {
	
	public static Printable getPrintable()
	{
		return new B();  //return any one instance A or B
	}

}
