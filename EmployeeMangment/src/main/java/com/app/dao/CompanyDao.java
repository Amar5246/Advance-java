package com.app.dao;

import java.util.List;

import com.app.pojos.Company;

public interface CompanyDao {
	Company getCompany(String company); 
	List<Company> getAllCompanies();
}
