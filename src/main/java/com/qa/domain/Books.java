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
public class Books {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	@Size(min = 2, max = 80)
	private String title;
	@Size(min = 2, max = 80)
	private String genre;
	@Size(min = 4, max = 4)
	private String yearPublished;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Author> authors = new HashSet<>();

	public Books() {

	}

	public Books(String Title, String Genre, String YearPublished) {
		this.title = title;
		this.genre = genre;
		this.yearPublished = yearPublished;
		this.authors = authors;
	}

	public String getFirstName() {
		return title;
	}

	public void setFirstName(String firstName) {
		this.title = title;
	}

	public String getSecondName() {
		return genre;
	}

	public void setSecondName(String secondName) {
		this.genre = genre;
	}

	public String getAccountNumber() {
		return yearPublished;
	}

	public void setAccountNumber(String accountNumber) {
		this.yearPublished = yearPublished;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Set<Author> getAuthors() {
		return authors;
	}

	public void setTransactions(Set<Author> authors) {
		this.authors = authors;
	}

}
