package com.qa.service.repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.domain.Book;
import com.qa.util.JSONUtil;

@ApplicationScoped
@Alternative
public class BookMapRepository implements BookRepository {
	
	private static final Logger LOGGER = Logger.getLogger(BookRepository.class);

	private final Long INITIAL_COUNT = 1L;
	private Map<Long,Book> bookMap;
	private Long ID;

	@Inject
	private JSONUtil util;

	public BookMapRepository() {
		this.bookMap = new HashMap<Long,Book>();
		ID = INITIAL_COUNT;
//		initBookMap();
	}

	@Override
	public String getAllBooks() {
		LOGGER.info("BookMapRepository + getAllBooks");
		return util.getJSONForObject(bookMap.values());
	}

	@Override
	public String createBook(String book) {
		LOGGER.info("BookMapRepository + createBook");
		ID++;
		Book newBook = util.getObjectForJSON(book, Book.class);
		bookMap.put(ID, newBook);
		return book;
	}

	@Override
	public String deleteBook(Long id) {
		LOGGER.info("AccountMapRepository + deleteAccount");
		bookMap.remove(id);
		return "{\"message\": \"accout sucessfully removed\"}";
	}

//	private void initBookMap() {
//		LOGGER.info("BookMapRepository + initBookMap");
//		Set<Transaction> transactions = new HashSet<>();
//		transactions.add(new Transaction("tesco", "1234"));
//		Book book = new Book("Joe", "Bloggs", "1234", transactions);
//		bookMap.put(1L, book);
//	}


}
