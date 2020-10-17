package com.cra.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cra.dao.BookDAO;

@Repository
public class OnlineBookService implements BookService {
	
	@Autowired
	BookDAO dao;

	@Override
	public Book createBook(Book book) throws SQLException {
		// TODO Auto-generated method stub
		try {
			return dao.insertBook(book);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return book;
	}

}
