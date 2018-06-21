package com.qa.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
public class Book {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	@Size(min = 2, max = 80)
	private String title;
	@Size(min = 2, max = 80)
	private String genre;
	@Size(min = 4, max = 4)
	private String yearPublished;

//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	private Set<Author> authors = new HashSet<>();

	public Book() {

	}

	public Book(String title, String genre, String yearPublished) {
		this.title = title;
		this.genre = genre;
		this.yearPublished = yearPublished;
//		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(String yearPublished) {
		this.yearPublished = yearPublished;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
//	public Set<Author> getAuthors() {
//		return authors;
//	}
//
//	public void setTransactions(Set<Author> authors) {
//		this.authors = authors;
//	}

}
