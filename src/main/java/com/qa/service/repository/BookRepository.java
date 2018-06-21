package com.qa.service.repository;

public interface BookRepository {
	
	String getAllBooks();

	String createBook(String accout);

	String deleteBook(Long id);

}
