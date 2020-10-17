package com.cra.service;

import java.sql.SQLException;

import org.springframework.context.annotation.Bean;


public interface BookService {
	
	@Bean
	public Book createBook(Book book) throws SQLException;

}
