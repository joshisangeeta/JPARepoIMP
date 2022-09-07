package com.sj.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sj.model.Student;

public class TestStudentCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	  EntityManagerFactory factory= Persistence.createEntityManagerFactory("JPAHibernateDemo1");
	
	  EntityManager em = factory.createEntityManager();
	
	  em.getTransaction().begin();
	  
	  Student newStudent = new Student("abc");
	  
	  em.persist(newStudent);
	  
	  Student aakash=    em.find(Student.class, 6);
	   
	  System.out.println(aakash);
	  
	  aakash.setName("aakashM");
	  em.merge(aakash);
	  Student aakashUpdated= em.find(Student.class, 6);
	  
	  System.out.println(aakashUpdated);
	  
	  Student abc1 = em.find(Student.class,7);
	  em.remove(abc1);
	  
	  em.getTransaction().commit();
	  em.close();
	
	
	}

}
