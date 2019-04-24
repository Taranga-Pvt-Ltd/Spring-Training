package com.tharanga.dao;

import java.util.List;
import com.tharanga.model.Employee;

public interface EmployeeDAO {
	
	public  void save(Employee emp);
	
    public List<Employee> list();

}
