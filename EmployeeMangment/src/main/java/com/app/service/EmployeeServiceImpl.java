package com.app.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.CompanyDao;
import com.app.dao.EmployeeDao;
import com.app.pojos.Company;
import com.app.pojos.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	//dep
	@Autowired
	private EmployeeDao empDao; 
	@Autowired 
	private CompanyDao compDao; 
	@Override 
	
	public List<Employee> listEmps() {
		// TODO Auto-generated method stub
		List<Employee> emps = empDao.getAllEmps();
	//	emps.forEach(e -> e.getMyDept());
		return emps;
	}

	@Override
	public String addEmployee(String name,Employee e) {
		Company company=compDao.getCompany(name);  
		System.out.println(company);
		company.addEmployee(e);   
//		System.out.println("kjdvsjkdvkjsbvhj");
//		empDao.addEmployee(e);
		return "Employee added succsefully";	
	}

	@Override
	public List<Employee> listperticularEmps(String company) {
		
		Company comp=compDao.getCompany(company); 
		List<Employee> emps=comp.getEmpList(); 
		emps.get(0).getFirstName(); 
		return emps;
	}

}
