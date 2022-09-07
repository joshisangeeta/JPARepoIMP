package com.sj.test;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sj.model.Movie;
import com.sj.model.Theatre;




public class TestManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	  EntityManagerFactory factory= Persistence.createEntityManagerFactory("ManyToManyDemo");
	
	  EntityManager em = factory.createEntityManager();
	
	  em.getTransaction().begin();
	  
	    Set <Movie> movies = new HashSet<>();
	    movies.add(new Movie("movie1", "Thriller", "1991"));
	    movies.add(new Movie("movie2", "RomCom", "1997"));
	    movies.add(new Movie("movie3", "suspense thriller", "2021"));   
	    
	    Theatre t1 = new Theatre("thr1", movies);
	  
	    em.persist(t1);	
	    
	    
	   /* Theatre t2 = new Theatre("thr2");
	    Theatre t3 = new Theatre("thr3");
	    Theatre t4 = new Theatre("thr4");
	    Set<Theatre> theatres = new HashSet<>();
	    
	    theatres.add(t2);
	    theatres.add(t3);
	    theatres.add(t4);
	    
	    Movie m = new Movie("t1","thriller","2020");
	    m.setTheatres(theatres);
	    em.persist(m);*/
	    em.getTransaction().commit();
	    em.close();
	
	
	}

}
