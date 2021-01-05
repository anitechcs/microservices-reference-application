package com.anitechcs.orderservice.repository;

import com.anitechcs.orderservice.model.Order;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Order repository
 * 
 * @author Tapas Jena
 */
@Repository
public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {
    
    //TODO: Implement data access logic

}
