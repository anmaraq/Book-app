package com.qa.service.buisness;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.service.repository.BookRepository;

public class BookServiceImpl implements BookService{
	
	private static final Logger LOGGER = Logger.getLogger(BookService.class);

	@Inject
	private BookRepository repo;

	@Override
	public String addBook(String book) {
		LOGGER.info("In BookServiceImpl addBook ");
		return repo.createBook(book);
	}

	@Override
	public String deleteBook(Long id) {
		LOGGER.info("In BookServiceImpl deleteBook ");
		return repo.deleteBook(id);

	}

	public void setRepo(BookRepository repo) {
		this.repo = repo;
	}

	@Override
	public String getAllBooks() {
		LOGGER.info("In BooksServiceImpl getAllBooks ");
		return repo.getAllBooks();
	}

}
