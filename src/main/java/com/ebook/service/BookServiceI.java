package com.ebook.service;

import java.util.List;

import com.ebook.Entity.Book;

public interface BookServiceI {
	
	public boolean addBook(Book book);
	public List<Book> getAllBooks();
	

}
