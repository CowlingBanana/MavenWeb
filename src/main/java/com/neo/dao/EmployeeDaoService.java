package com.neo.dao;

import java.util.List;

import com.neo.model.EmployeeSpring;

public interface EmployeeDaoService {
	
	void saveEmployee(EmployeeSpring e);
	
	List<EmployeeSpring> allEmployees();
	
	void deleteEmployee(Integer id);
	
	EmployeeSpring employeeById(Integer id);
	
	void updateEmployee(EmployeeSpring e);
	
}
