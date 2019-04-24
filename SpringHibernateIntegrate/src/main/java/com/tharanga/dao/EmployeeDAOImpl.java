package com.tharanga.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tharanga.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
	public void save(Employee emp) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(emp);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	public List<Employee> list() {
		Session session = this.sessionFactory.openSession();
		List<Employee> empList = session.createQuery("from Employee").list();
		session.close();
		return empList;
	}

	

}
