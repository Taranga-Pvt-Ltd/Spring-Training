package com.tharanga.SpringAopAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {
	public static void main(String Args[])
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Alien a1 = context.getBean(Alien.class);
		a1.show();
	}

}
