package com.anitechcs.bookservice.repository;

import java.util.List;

import com.anitechcs.bookservice.model.Book;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * This class represents repository layer
 * 
 * @author Tapas Jena
 */
@Repository
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {


}
