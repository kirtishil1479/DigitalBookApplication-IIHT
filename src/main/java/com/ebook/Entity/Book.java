package com.ebook.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	private String title;
	private String category;
	private double price;
	private String auther;
	private String publisher;
	private Date publishedDate;
	private  String chapters;
	private String status;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getAuther() {
		return auther;
	}


	public void setAuther(String auther) {
		this.auther = auther;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public Date getPublishedDate() {
		return publishedDate;
	}


	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}


	public String getChapters() {
		return chapters;
	}


	public void setChapters(String chapters) {
		this.chapters = chapters;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Book(int bookId, String title, String category, double price, String auther, String publisher,
			Date publishedDate, String chapters, String status) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.category = category;
		this.price = price;
		this.auther = auther;
		this.publisher = publisher;
		this.publishedDate = publishedDate;
		this.chapters = chapters;
		this.status = status;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", category=" + category + ", price=" + price
				+ ", auther=" + auther + ", publisher=" + publisher + ", publishedDate=" + publishedDate + ", chapters="
				+ chapters + ", status=" + status + "]";
	}
	
	
	
	
	

}
