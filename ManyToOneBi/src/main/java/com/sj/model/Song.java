package com.sj.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@Entity(name="songbi")
public class Song {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int songId;
	String title;
	
	@ManyToOne
	//for manytoOne uni,on removal of movie,songs should be deleted but no soln in jpa
	//for this so use hibernate solution @OnDelete or go for bi directional or OneToMany Uni
	//@OnDelete(action = OnDeleteAction.CASCADE)
	Movie movie;
    
	
	
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Song(String title, Movie movie) {
		super();
		this.title = title;
		this.movie = movie;
	}


	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}


	@Override
	public String toString() {
		return "Song [songId=" + songId + ", title=" + title + ", movie=" + movie + "]";
	}
	
	
	
	

}
