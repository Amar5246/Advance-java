package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Employee;
import com.app.service.CompanyService;
import com.app.service.EmployeeService;

@Controller
@RequestMapping("/emps")
public class EmployeeController {
	//dep : 
	@Autowired//(required = true)
	private EmployeeService empService; 
	
	public EmployeeController() {
		System.out.println("in ctor of " + getClass());
	}
	// add a req handling method to send list of emps from handler --> D.S , using
	// ModelAttrs : using Model map
	@GetMapping("/list")
	public String listEmps(Model map)
	{
		System.out.println("in list emps");
		map.addAttribute("emp_list",empService.listEmps());
		return "/emps/list";//AVN : /WEB-INF/views/emps/list.jsp
		//impl : model map 
	}  
	@PostMapping("/add")
	public String addEmployee(@RequestParam String fname,@RequestParam String lname,@RequestParam String cityName,@RequestParam String company,Model map)
	{
		Employee e=new Employee(fname, lname, cityName); 
		String msg=empService.addEmployee(company, e); 
		map.addAttribute("msg",msg);
		return "/display";
	} 
	@PostMapping("/getEmps")
	public String getALlEmps(@RequestParam String company,Model map)
	{
		List<Employee> listemps=empService.listperticularEmps(company); 
		map.addAttribute("listEmps", listemps);
		return "/listEmp";
	}
}
