package com.qa.integration;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import com.qa.service.buisness.BookService;

@Path("/book")
public class BookEndpoint {

	private static final Logger LOGGER = Logger.getLogger(BookEndpoint.class);

	@Inject
	private BookService service;

	@Path("/json")
	@GET
	@Produces({ "application/json" })
	public String getAllBooks() {
		LOGGER.info("BookEndpoint + getAllBooks");
		return service.getAllBooks();
	}

	@Path("/json")
	@POST
	@Produces({ "application/json" })
	public String addBook(String book) {
		LOGGER.info("BookEndpoint + addBook");
		return service.addBook(book);
	}

	@Path("/json/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteBook(@PathParam("id") Long id) {
		LOGGER.info("BookEndpoint + deleteBook");
		return service.deleteBook(id);

	}

	public void setService(BookService service) {
		LOGGER.info("BookEndpoint + setService");
		this.service = service;
	}

}
