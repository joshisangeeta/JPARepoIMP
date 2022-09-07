package com.sj.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private   int employeeId;
	private   String name;
	private   double salary;
	@OneToOne(cascade=CascadeType.ALL)
	//if Join column skipped hibernate will create a join column in emp table with 
	//name using fieldname and primary key in Address(address_address_id)
	@JoinColumn(name="addressID",referencedColumnName="address_id")
	private   Address address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee( String name, double salary, Address address) {
		super();
	//	this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ "]";
	} 
	
	
	
	
	

}
