package com.sj.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sj.model.Address;
import com.sj.model.Employee;


public class TestOneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	  EntityManagerFactory factory= Persistence.createEntityManagerFactory("OneToOneDemo");
	
	  EntityManager em = factory.createEntityManager();
	
	  em.getTransaction().begin();
	  
	  Address address = new Address("addressOne");
	  Employee e1 = new Employee("name1", 50000, address);
	  em.persist(e1);
	  
	  em.getTransaction().commit();
	  em.close();
	
	
	}

}
