package com.tharanga.dependencyinjectionbydependentobject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CIDOTest {

	//Constructor Injection Dependent Object
	 public static void main(String[] args) {  
         
	        Resource r=new ClassPathResource("cidoapplicationContext.xml");  
	        BeanFactory factory=new XmlBeanFactory(r);  
	          
	        CIDOEmployee s=(CIDOEmployee)factory.getBean("e");  
	        s.displayInfo();  
	          
	    }  
}
