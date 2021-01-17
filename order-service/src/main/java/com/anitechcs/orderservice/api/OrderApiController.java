package com.anitechcs.orderservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import com.anitechcs.orderservice.model.Order;
import com.anitechcs.orderservice.model.OrderDetailSuccessResponse;
import com.anitechcs.orderservice.model.OrderListSuccessResponse;
import com.anitechcs.orderservice.model.OrderSuccessResponse;
import com.anitechcs.orderservice.service.OrderService;

/**
 * This Controller implements OrderApi interface and provides extension point 
 * for service and business logic integration.
 * 
 * @author Tapas Jena
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Controller
@Api(value = "order", description = "the order API", tags = {"Order-Service"})
@RequestMapping("${openapi.orderServiceAPISpecification.base-path:/v1}")
public class OrderApiController implements OrderApi {

    private final NativeWebRequest request;
    private OrderService orderService;

    @Autowired
    public OrderApiController(NativeWebRequest request, OrderService orderService) {
        this.request = request;
        this.orderService = orderService;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<OrderSuccessResponse> createNewOrder(@ApiParam(value = "Oredr creation content"  )  @Valid @RequestBody(required = false) Order order) {
        OrderSuccessResponse orderSuccessResponse = new OrderSuccessResponse();
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    //TODO: Make Service layer call
                    Order newlyCreatedOrder = orderService.createNewOrder(order);
                    
                    //TODO: Build the orderSuccessResponse object here
                }
            }
        });
        return new ResponseEntity<>(orderSuccessResponse, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<OrderListSuccessResponse> getAllOrders() {
        OrderListSuccessResponse orderListSuccessResponse = new OrderListSuccessResponse();
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    //TODO: Make Service layer call
                    List<Order> orderList = orderService.getAllOrders();
                    
                    //TODO: Build the orderListSuccessResponse object here
                }
            }
        });
        return new ResponseEntity<>(orderListSuccessResponse, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<OrderDetailSuccessResponse> getOrderById(@ApiParam(value = "Id of order to return details",required=true) @PathVariable("orderId") Long orderId) {
        OrderDetailSuccessResponse orderDetailSuccessResponse = new OrderDetailSuccessResponse();
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    //TODO: Make Service layer call
                    Order order = orderService.getOrderById(orderId);
                    
                    //TODO: Build the orderDetailSuccessResponse object here
                }
            }
        });
        return new ResponseEntity<>(orderDetailSuccessResponse, HttpStatus.OK);
    }

}
