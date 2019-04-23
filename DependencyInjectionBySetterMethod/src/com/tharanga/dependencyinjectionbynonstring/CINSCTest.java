package com.tharanga.dependencyinjectionbynonstring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CINSCTest {
	
	public static void main(String[] args) {  
	    Resource r=new ClassPathResource("cinscapplicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    CINSCQuestion que=(CINSCQuestion)factory.getBean("q");  
	    que.displayInfo();  
	      
	}  

}
