/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.1-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.anitechcs.orderservice.api;

import com.anitechcs.orderservice.model.InlineResponse200;
import com.anitechcs.orderservice.model.InlineResponse2001;
import com.anitechcs.orderservice.model.InlineResponse2002;
import com.anitechcs.orderservice.model.Order;
import com.anitechcs.orderservice.model.OrderErrorResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-21T12:56:54.131Z[GMT]")
@Validated
@Api(value = "order", description = "the order API")
public interface OrderApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /order
     * Place a new order
     *
     * @param order Oredr creation content (optional)
     * @return Success response (status code 200)
     *         or Client error (status code 400)
     *         or Server error (status code 500)
     */
    @ApiOperation(value = "", nickname = "createNewOrder", notes = "Place a new order", response = InlineResponse2001.class, tags={ "Order-Service", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success response", response = InlineResponse2001.class),
        @ApiResponse(code = 400, message = "Client error", response = OrderErrorResponse.class),
        @ApiResponse(code = 500, message = "Server error", response = OrderErrorResponse.class) })
    @PostMapping(
        value = "/order",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<InlineResponse2001> createNewOrder(@ApiParam(value = "Oredr creation content"  )  @Valid @RequestBody(required = false) Order order) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"orderId\" : 6, \"message\" : \"message\", \"statusCode\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /order
     * Get All Orders with Pagination
     *
     * @param limit Number of items service will return (required)
     * @param offset Offset the results by this number (optional, default to 0)
     * @return Success response (status code 200)
     *         or Client error (status code 400)
     *         or No records found (status code 404)
     *         or Server error (status code 500)
     */
    @ApiOperation(value = "", nickname = "getAllOrders", notes = "Get All Orders with Pagination", response = InlineResponse200.class, tags={ "Order-Service", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success response", response = InlineResponse200.class),
        @ApiResponse(code = 400, message = "Client error", response = OrderErrorResponse.class),
        @ApiResponse(code = 404, message = "No records found", response = OrderErrorResponse.class),
        @ApiResponse(code = 500, message = "Server error", response = OrderErrorResponse.class) })
    @GetMapping(
        value = "/order",
        produces = { "application/json" }
    )
    default ResponseEntity<InlineResponse200> getAllOrders(@NotNull @ApiParam(value = "Number of items service will return", required = true, defaultValue = "10") @Valid @RequestParam(value = "limit", required = true, defaultValue="10") Integer limit,@ApiParam(value = "Offset the results by this number", defaultValue = "0") @Valid @RequestParam(value = "offset", required = false, defaultValue="0") Integer offset) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"total\" : 6, \"_links\" : { \"next\" : { \"href\" : \"https://openapi-generator.tech\" }, \"last\" : { \"href\" : \"https://openapi-generator.tech\" }, \"prev\" : { \"href\" : \"https://openapi-generator.tech\" }, \"self\" : { \"href\" : \"https://openapi-generator.tech\" }, \"first\" : { \"href\" : \"https://openapi-generator.tech\" } }, \"message\" : \"message\", \"results\" : [ { \"amount\" : 7.061401241503109, \"quantity\" : 5, \"address\" : { \"zip\" : 2, \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"city\" : \"city\", \"phone\" : \"phone\", \"addressLine\" : \"addressLine\", \"email\" : \"email\" }, \"orderId\" : 1, \"paymentMethod\" : \"Paypal\", \"shipDate\" : \"2000-01-23T04:56:07.000+00:00\", \"complete\" : false, \"bookId\" : 5, \"status\" : \"placed\" }, { \"amount\" : 7.061401241503109, \"quantity\" : 5, \"address\" : { \"zip\" : 2, \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"city\" : \"city\", \"phone\" : \"phone\", \"addressLine\" : \"addressLine\", \"email\" : \"email\" }, \"orderId\" : 1, \"paymentMethod\" : \"Paypal\", \"shipDate\" : \"2000-01-23T04:56:07.000+00:00\", \"complete\" : false, \"bookId\" : 5, \"status\" : \"placed\" } ], \"statusCode\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /order/{orderId}
     * Get order details
     *
     * @param orderId Id of order to return details (required)
     * @return Success response (status code 200)
     *         or Client error (status code 400)
     *         or No records found (status code 404)
     *         or Server error (status code 500)
     */
    @ApiOperation(value = "", nickname = "getOrderById", notes = "Get order details", response = InlineResponse2002.class, tags={ "Order-Service", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success response", response = InlineResponse2002.class),
        @ApiResponse(code = 400, message = "Client error", response = OrderErrorResponse.class),
        @ApiResponse(code = 404, message = "No records found", response = OrderErrorResponse.class),
        @ApiResponse(code = 500, message = "Server error", response = OrderErrorResponse.class) })
    @GetMapping(
        value = "/order/{orderId}",
        produces = { "application/json" }
    )
    default ResponseEntity<InlineResponse2002> getOrderById(@ApiParam(value = "Id of order to return details",required=true) @PathVariable("orderId") Long orderId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\", \"results\" : { \"amount\" : 7.061401241503109, \"quantity\" : 5, \"address\" : { \"zip\" : 2, \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"city\" : \"city\", \"phone\" : \"phone\", \"addressLine\" : \"addressLine\", \"email\" : \"email\" }, \"orderId\" : 1, \"paymentMethod\" : \"Paypal\", \"shipDate\" : \"2000-01-23T04:56:07.000+00:00\", \"complete\" : false, \"bookId\" : 5, \"status\" : \"placed\" }, \"statusCode\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
