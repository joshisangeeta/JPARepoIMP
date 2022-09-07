package com.sj.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sj.model.Movie;
import com.sj.model.Song;


public class TestManyToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	  EntityManagerFactory factory= Persistence.createEntityManagerFactory("ManyToOneDmeo");
	
	  EntityManager em = factory.createEntityManager();
	
	  em.getTransaction().begin();
	 /* Movie m1 =new Movie("someMovie", "horror","2021" );
	  
	  Song s1 = new Song("song1",m1);
	  
	  Song s2 = new Song("song2",m1);
	  
	  Song s3 = new Song("song3",m1);
	  em.persist(m1);
	  em.persist(s1);
	  em.persist(s2);
	  em.persist(s3);
	  */
	  Movie m3 =  em.find(Movie.class, 27);
	  em.remove(m3);
	  
	  em.getTransaction().commit();
	  em.close();
	
	
	}

}
