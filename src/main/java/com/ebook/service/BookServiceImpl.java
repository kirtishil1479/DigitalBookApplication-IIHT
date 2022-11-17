package com.ebook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebook.Entity.Book;
import com.ebook.repository.BookRepository;

@Service
public class BookServiceImpl implements BookServiceI {
	
	@Autowired
	private BookRepository bookRepo;

	@Override
	public boolean addBook(Book book) {
		Book save = this.bookRepo.save(book);
		if(save!=null) {
			return true;
		}
		return false;
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> books = this.bookRepo.findAll();
		if(books!=null) {
			return books;
		}
		return null;
	}
	
	
	
	

}
