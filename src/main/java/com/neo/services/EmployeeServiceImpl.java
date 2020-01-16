package com.neo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neo.dao.EmployeeDaoService;
import com.neo.model.EmployeeSpring;

@Repository
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDaoService daoService;
	public void saveEmployee(EmployeeSpring e) {
		daoService.saveEmployee(e);
		
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
