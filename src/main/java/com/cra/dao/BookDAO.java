package com.cra.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.cra.service.Book;

@Repository
public class BookDAO {
	
	public Book insertBook(Book book) throws SQLException, ClassNotFoundException {
		
		Connection con = new  DBConnector().getConnection();
		String query=("insert into springbook values(?,?,?,?)");
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1, 1);
		ps.setString(2, "The Alchemist");
		ps.setString(3, "Paulo Choelo");
		ps.setDouble(4, 350);
		
		ps.executeUpdate();
		return book;
		
	}

}
