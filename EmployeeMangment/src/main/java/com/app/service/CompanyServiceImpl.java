package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CompanyDao;
import com.app.pojos.Company;
@Service 
@Transactional
public class CompanyServiceImpl implements CompanyService {

	@Autowired 
	private CompanyDao compDao;
	
	@Override
	public List<Company> getListOfCompanies() {
		
		return compDao.getAllCompanies();
	}

	@Override
	public Company getCompany(String comapny) {
		
		return compDao.getCompany(comapny);
	}

}
