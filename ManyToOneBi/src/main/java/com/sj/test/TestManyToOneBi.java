package com.sj.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sj.model.Movie;
import com.sj.model.Song;


public class TestManyToOneBi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	  EntityManagerFactory factory= Persistence.createEntityManagerFactory("ManyToOneBi");
	
	  EntityManager em = factory.createEntityManager();
	
	  em.getTransaction().begin();
	  Movie m1 =new Movie("Movie2", "thriller","2022" );
	  
	  Song s1 = new Song("song12",m1);
	  
	  Song s2 = new Song("song22",m1);
	  
	  Song s3 = new Song("song33",m1);
	  em.persist(m1);
	  em.persist(s1);
	  em.persist(s2);
	  em.persist(s3);
	  
	  Movie m3 =  em.find(Movie.class, 19);
	  em.remove(m3);
	  
	  em.getTransaction().commit();
	  em.close();
	
	
	}

}
