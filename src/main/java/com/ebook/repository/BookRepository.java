package com.ebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ebook.Entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
