package com.sj.model;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="moviebi")
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int movieId;
	String movieTitle;
	
	String genre;
	
    String yearOfRelease;
    
    @OneToMany(mappedBy = "movie",cascade=CascadeType.REMOVE)
    Set<Song> songs;
    
    

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Movie(String movieTitle, String genre, String yearOfRelease) {
		super();
		this.movieTitle = movieTitle;
		this.genre = genre;
		this.yearOfRelease = yearOfRelease;
	}


	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(String yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieTitle=" + movieTitle + ", genre=" + genre + ", yearOfRelease="
				+ yearOfRelease + "]";
	}
    
    
    
    
    
    
    
    
    
    
}
