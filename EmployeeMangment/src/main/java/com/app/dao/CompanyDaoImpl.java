package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Company;
@Repository
public class CompanyDaoImpl implements CompanyDao {
	
	@Autowired //byType
	private SessionFactory sf;
	@Override
	public Company getCompany(String company) {
		String jpql="select c from Company c where c.companyName=:comp";
		return sf.getCurrentSession().createQuery(jpql,Company.class).setParameter("comp",company).getSingleResult();
	}
	@Override
	public List<Company> getAllCompanies() {
		String jpql="select c from Company c";
		return sf.openSession().createQuery(jpql,Company.class).getResultList();
	}

}
