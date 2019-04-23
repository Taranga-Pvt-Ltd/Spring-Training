package com.tharanga.staticfactorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
		Printable p = (Printable) context.getBean("a");
		p.print();
	}

}
