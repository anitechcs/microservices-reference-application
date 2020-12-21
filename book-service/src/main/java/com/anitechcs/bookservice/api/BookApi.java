/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.1-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.anitechcs.bookservice.api;

import com.anitechcs.bookservice.model.BookErrorResponse;
import com.anitechcs.bookservice.model.InlineResponse200;
import com.anitechcs.bookservice.model.InlineResponse2001;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "book", description = "the book API")
public interface BookApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /book
     * Get All Books with Filtering, Sorting, and Pagination
     *
     * @param limit Number of items service will return (required)
     * @param offset Offset the results by this number (optional, default to 0)
     * @return Success response (status code 200)
     *         or Client error (status code 400)
     *         or No records found (status code 404)
     *         or Server error (status code 500)
     */
    @ApiOperation(value = "", nickname = "getAllBooks", notes = "Get All Books with Filtering, Sorting, and Pagination", response = InlineResponse200.class, tags={ "Book-Service", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success response", response = InlineResponse200.class),
        @ApiResponse(code = 400, message = "Client error", response = BookErrorResponse.class),
        @ApiResponse(code = 404, message = "No records found", response = BookErrorResponse.class),
        @ApiResponse(code = 500, message = "Server error", response = BookErrorResponse.class) })
    @GetMapping(
        value = "/book",
        produces = { "application/json" }
    )
    default ResponseEntity<InlineResponse200> getAllBooks(@NotNull @ApiParam(value = "Number of items service will return", required = true, defaultValue = "10") @Valid @RequestParam(value = "limit", required = true, defaultValue="10") Integer limit,@ApiParam(value = "Offset the results by this number", defaultValue = "0") @Valid @RequestParam(value = "offset", required = false, defaultValue="0") Integer offset) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"total\" : 6, \"_links\" : { \"next\" : { \"href\" : \"https://openapi-generator.tech\" }, \"last\" : { \"href\" : \"https://openapi-generator.tech\" }, \"prev\" : { \"href\" : \"https://openapi-generator.tech\" }, \"self\" : { \"href\" : \"https://openapi-generator.tech\" }, \"first\" : { \"href\" : \"https://openapi-generator.tech\" } }, \"message\" : \"message\", \"results\" : [ { \"isbn\" : \"isbn\", \"coverPhoto\" : \"coverPhoto\", \"description\" : \"description\", \"language\" : \"language\", \"title\" : \"title\", \"bookId\" : 1, \"tags\" : [ \"tags\", \"tags\" ], \"promotions\" : { \"color\" : \"#0D47A1\", \"text\" : \"15% off\" }, \"genres\" : [ \"genres\", \"genres\" ], \"price\" : { \"amount\" : 5.637377, \"currency\" : \"currency\" }, \"ratings\" : { \"rating\" : 2.302136, \"ratingCount\" : 7 }, \"totalPages\" : 5, \"publisher\" : \"publisher\", \"publicationDate\" : \"2000-01-23\", \"authors\" : [ \"authors\", \"authors\" ] }, { \"isbn\" : \"isbn\", \"coverPhoto\" : \"coverPhoto\", \"description\" : \"description\", \"language\" : \"language\", \"title\" : \"title\", \"bookId\" : 1, \"tags\" : [ \"tags\", \"tags\" ], \"promotions\" : { \"color\" : \"#0D47A1\", \"text\" : \"15% off\" }, \"genres\" : [ \"genres\", \"genres\" ], \"price\" : { \"amount\" : 5.637377, \"currency\" : \"currency\" }, \"ratings\" : { \"rating\" : 2.302136, \"ratingCount\" : 7 }, \"totalPages\" : 5, \"publisher\" : \"publisher\", \"publicationDate\" : \"2000-01-23\", \"authors\" : [ \"authors\", \"authors\" ] } ], \"statusCode\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /book/{bookId}
     * Get book details
     *
     * @param bookId Id of book to return details (required)
     * @return Success response (status code 200)
     *         or Client error (status code 400)
     *         or No records found (status code 404)
     *         or Server error (status code 500)
     */
    @ApiOperation(value = "", nickname = "getBookById", notes = "Get book details", response = InlineResponse2001.class, tags={ "Book-Service", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success response", response = InlineResponse2001.class),
        @ApiResponse(code = 400, message = "Client error", response = BookErrorResponse.class),
        @ApiResponse(code = 404, message = "No records found", response = BookErrorResponse.class),
        @ApiResponse(code = 500, message = "Server error", response = BookErrorResponse.class) })
    @GetMapping(
        value = "/book/{bookId}",
        produces = { "application/json" }
    )
    default ResponseEntity<InlineResponse2001> getBookById(@ApiParam(value = "Id of book to return details",required=true) @PathVariable("bookId") Long bookId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\", \"results\" : { \"isbn\" : \"isbn\", \"coverPhoto\" : \"coverPhoto\", \"description\" : \"description\", \"language\" : \"language\", \"title\" : \"title\", \"bookId\" : 1, \"tags\" : [ \"tags\", \"tags\" ], \"promotions\" : { \"color\" : \"#0D47A1\", \"text\" : \"15% off\" }, \"genres\" : [ \"genres\", \"genres\" ], \"price\" : { \"amount\" : 5.637377, \"currency\" : \"currency\" }, \"ratings\" : { \"rating\" : 2.302136, \"ratingCount\" : 7 }, \"totalPages\" : 5, \"publisher\" : \"publisher\", \"publicationDate\" : \"2000-01-23\", \"authors\" : [ \"authors\", \"authors\" ] }, \"statusCode\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
