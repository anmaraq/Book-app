package com.qa.service.buisness;

public interface BookService {
	
	String getAllBooks();

	String addBook(String book);

	String deleteBook(Long id);
	
}
