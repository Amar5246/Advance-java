package com.app.service;

import java.util.List;

import com.app.pojos.Employee;

public interface EmployeeService {
	List<Employee> listEmps(); 
	String addEmployee(String name,Employee e); 
	List<Employee> listperticularEmps(String company);
}
