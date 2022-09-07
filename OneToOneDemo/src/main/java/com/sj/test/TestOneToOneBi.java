package com.sj.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.sj.model.bi.Department;
import com.sj.model.bi.Emp;


public class TestOneToOneBi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	  EntityManagerFactory factory= Persistence.createEntityManagerFactory("OneToOneDemo");
	
	  EntityManager em = factory.createEntityManager();
	
	  em.getTransaction().begin();
	  
	  Department d = new Department( "Dev");
	  Emp e1 = new Emp("name1", 50000, d);
	  em.persist(e1);
	  
	  em.getTransaction().commit();
	  em.close();
	
	
	}

}
