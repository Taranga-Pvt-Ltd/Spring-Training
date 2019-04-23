package com.annotation.around;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	 public static void main(String[] args){  
	        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");  
	          
	        Operation op = (Operation) context.getBean("opBean");  
	        op.msg();  
	        op.display();  
	    }  

}
