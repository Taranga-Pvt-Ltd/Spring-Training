package com.springnamedjdbc;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class SimpleTest {  
  public static void main(String[] args) {  
      
    Resource r=new ClassPathResource("applicationContext5.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    EmpDao dao=(EmpDao)factory.getBean("edao");  
    dao.save(new Emp(24,"deepu",150000));  
    System.out.println("data inserted successfully");
      
  }  
}  