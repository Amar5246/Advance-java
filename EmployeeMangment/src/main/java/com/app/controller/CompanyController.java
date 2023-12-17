package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.pojos.Company;
import com.app.service.CompanyService;

@Controller 
public class CompanyController {
	
	@Autowired 
	private CompanyService compSrvice; 
	
	public CompanyController() {
		System.out.println("in company controller");
	} 
	
	@GetMapping("/getComp")
	public String getAllCompanies( Model map)
	{
		map.addAttribute("compList",compSrvice.getListOfCompanies());
		return "/addPlayer";
	} 
	
}
