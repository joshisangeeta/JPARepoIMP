package com.sj.model.bi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int dept_id;
	private String dept_name;
	@OneToOne(mappedBy="department")
	Emp emp;
		
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department( String dept_name) {
		super();
	//	this.dept_id = dept_id;
		this.dept_name = dept_name;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + "]";
	}
    
}
