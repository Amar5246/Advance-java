package com.app.pojos;
/*
 * emp_id(PK) ,first_name,last_name,email(unique)
password(not null),join_date,emp_type(full_time/part_time/contract...:enum),salary


 */



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity // mandatory
@Table(name = "employee")
public class Employee extends BaseEntity{
	@Column(name="first_name",length = 30)//varchar(30)
	private String firstName;
	@Column(name="last_name",length = 30)//varchar(30)
	private String lastName;  
	@Column(length = 30)
	private String city;  
	@ManyToOne(fetch = FetchType.EAGER ) 
	@JoinColumn(name = "company_id")
	private Company company; 
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", company=" + company
				+ "]";
	} 
	
	
	
}