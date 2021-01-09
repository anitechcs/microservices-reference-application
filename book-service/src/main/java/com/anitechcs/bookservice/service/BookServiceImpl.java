package com.anitechcs.bookservice.service;

import java.util.List;
import java.util.Optional;

import com.anitechcs.bookservice.model.Book;
import com.anitechcs.bookservice.repository.BookRepository;

import org.springframework.stereotype.Service;

/**
 * This clas is the service implementation. 
 * Contains business logic for Book Service
 * 
 * @author Tapas Jena
 */
@Service
public class BookServiceImpl implements BookService {

    private BookRepository repository;

    BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    /**
     * 
     */
    @Override
    public List<Book> getAllBooks(int limit, int offset) {
        //TODO: Implement
        return null;
    }

    /**
     * 
     */
    @Override
    public Book getBookById(Long bookId) {
        Optional<Book> book = repository.findById(bookId);
        //TODO: Implement
        return null;
    }

    /**
     * 
     */
    @Override
    public List<String> getAllBookGenres() {
        //TODO: Implement
        return null;
    }
    
}
