/**
 * 
 */
package com.sj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author HP
 *
 */

@Entity(name="st")
public class Student {
     @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
	 int id;
     String name;
	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student( String name) {
		super();
		//this.id = id;
		this.name = name;
	}

}
