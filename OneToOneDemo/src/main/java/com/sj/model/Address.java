
package com.sj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int address_id;
	private String details;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address( String details) {
		super();
	//	this.address_id = address_id;
		this.details = details;
	}


	public int getAddress_id() {
		return address_id;
	}


	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}


	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", details=" + details + "]";
	}
	
	
	

}
