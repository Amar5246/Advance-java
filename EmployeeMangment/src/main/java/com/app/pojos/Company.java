package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "company") 
@Entity
public class Company extends BaseEntity{
    @Column(name = "company_name" ,length =30)
	private String companyName;  
    @OneToMany(mappedBy = "company"  ,cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Employee> empList=new ArrayList<>();
	public Company(String companyName) {
		super();
		this.companyName = companyName;
	} 
    
    public Company() {
		// TODO Auto-generated constructor stub
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	} 
    
    public void addEmployee(Employee e)
    {
    	empList.add(e); 
    	e.setCompany(this);
    }

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + "]";
	}
    
}
