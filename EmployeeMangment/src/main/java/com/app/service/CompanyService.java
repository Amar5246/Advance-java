package com.app.service;

import java.util.List;

import com.app.pojos.Company;

public interface CompanyService {
	List<Company> getListOfCompanies();  
	Company getCompany(String comapny);
}
