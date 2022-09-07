package com.sj.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
@Entity
public class Theatre {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int theatreId;
	String name;	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinColumn(name="thtr-movie",referencedColumnName="theatres")
	Set<Movie> movies;
	
	public Theatre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Theatre(String name, Set<Movie> movies) {
		super();
		this.name = name;
		this.movies = movies;
	}


	public Theatre(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}


	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Movie> getMovies() {
		return movies;
	}
	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}
	@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", name=" + name + ", movies=" + movies + "]";
	}
	
	

}
