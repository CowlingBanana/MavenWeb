package com.neo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neo.model.EmployeeSpring;

@Repository   
public class EmployeeDaoServiceImpl implements EmployeeDaoService{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void saveEmployee(EmployeeSpring e) {
		sessionFactory.getCurrentSession().saveOrUpdate(e);
		System.out.println("Data Saved from dao.");
		
	}

	public List<EmployeeSpring> allEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public EmployeeSpring employeeById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateEmployee(EmployeeSpring e) {
		// TODO Auto-generated method stub
		
	}
	
}
