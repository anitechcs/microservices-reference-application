package com.anitechcs.orderservice.service;

import java.util.List;

import com.anitechcs.orderservice.model.Order;

/**
 * Order service interface
 * 
 * @author Tapas Jena
 */
public interface OrderService {
    
    public Order createNewOrder(Order order);

    public List<Order> getAllOrders();

    public Order getOrderById(Long orderId);

}
