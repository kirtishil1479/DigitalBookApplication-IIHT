package com.ebook.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebook.Entity.Book;
import com.ebook.service.BookServiceI;

@RestController
public class BookController {
	
	@Autowired
	private BookServiceI bookService;
	
	
	@PostMapping("/addBook")
	public ResponseEntity<String> addBook(@RequestBody Book book){
		boolean addBook = this.bookService.addBook(book);
		if(addBook==true) {
			
		    return new ResponseEntity<String>("Book Added Successfully",HttpStatus.CREATED); 
			
		}
		return new ResponseEntity<String>("Book Not Added",HttpStatus.BAD_REQUEST);
	}
	

	@GetMapping("/getAllBooks")
	public ResponseEntity<List<Book>> getAllBookDetails(){
		List<Book> allBooks = this.bookService.getAllBooks();
		if(allBooks!=null) {
			return new ResponseEntity<List<Book>>(allBooks,HttpStatus.OK);
		}else {
			return new ResponseEntity("Books Not Available",HttpStatus.BAD_REQUEST);
		}
	}
	
}
