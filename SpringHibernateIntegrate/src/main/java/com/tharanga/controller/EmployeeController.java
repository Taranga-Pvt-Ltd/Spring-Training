package com.tharanga.controller;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.tharanga.dao.EmployeeDAO;
import com.tharanga.model.Employee;

public class EmployeeController {
	
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeDAO EmployeeDAO = context.getBean(EmployeeDAO.class);
		
		Employee emp = new Employee();
		emp.setName("RamyaShree");
		emp.setEmail("ramya@gmail.com");
		emp.setDepartment("HR");
		emp.setDesignation("Assistant");
		emp.setSalary(20000.00);
		
		EmployeeDAO.save(emp);
		
		System.out.println("Employee::"+emp);
		
		List<Employee> list = EmployeeDAO.list();
		
		for(Employee emp1 : list){
			System.out.println("Employee List::"+emp1);
		}
		
		context.close();
		
	}

}
