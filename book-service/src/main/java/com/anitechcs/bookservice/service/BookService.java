package com.anitechcs.bookservice.service;

import java.util.List;

import com.anitechcs.bookservice.model.Book;

/**
 * This is the service interface for Book
 * 
 * @author Tapas Jena
 */
public interface BookService {
    
    public List<Book> getAllBooks(int limit, int offset);

    public Book getBookById(Long bookId);

    public List<String> getAllBookGenres();

}
