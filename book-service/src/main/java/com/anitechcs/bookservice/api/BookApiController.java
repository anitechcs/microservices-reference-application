package com.anitechcs.bookservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.anitechcs.bookservice.model.Book;
import com.anitechcs.bookservice.model.BookGenreSuccessResponse;
import com.anitechcs.bookservice.model.BookListSuccessResponse;
import com.anitechcs.bookservice.model.BookSuccessResponse;
import com.anitechcs.bookservice.service.BookService;

/**
 * This Controller implements BookApi interface and provides extension point 
 * for service and business logic integration.
 * 
 * @author Tapas Jena
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Controller
@Api(value = "book", description = "the book API", tags = {"Book-Service"})
@RequestMapping("${openapi.bookServiceAPISpecification.base-path:/v1}")
public class BookApiController implements BookApi {

    private final NativeWebRequest request;
    private BookService bookService;

    @Autowired
    public BookApiController(NativeWebRequest request, BookService bookService) {
        this.request = request;
        this.bookService = bookService;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<BookListSuccessResponse> getAllBooks(@NotNull @ApiParam(value = "Number of items service will return", required = true, defaultValue = "10") @Valid @RequestParam(value = "limit", required = true, defaultValue="10") Integer limit,@ApiParam(value = "Offset the results by this number", defaultValue = "0") @Valid @RequestParam(value = "offset", required = false, defaultValue="0") Integer offset) {
        BookListSuccessResponse bookListSuccessResponse = new BookListSuccessResponse();
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    //TODO: Make Service layer call
                    List<Book> booksList = bookService.getAllBooks(limit, offset);
                    
                    //TODO: Build the bookListSuccessResponse object here
                }
            }
        });
        return new ResponseEntity<>(bookListSuccessResponse, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<BookGenreSuccessResponse> getAllBookGeneres() {
        BookGenreSuccessResponse bookGenreSuccessResponse = new BookGenreSuccessResponse();
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    //TODO: Make Service layer call
                    List<String> bookGeneres = bookService.getAllBookGenres();

                    //TODO: Build the bookGenreSuccessResponse object here
                }
            }
        });
        return new ResponseEntity<>(bookGenreSuccessResponse, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<BookSuccessResponse> getBookById(@ApiParam(value = "Id of book to return details",required=true) @PathVariable("bookId") Long bookId) {
        BookSuccessResponse bookSuccessResponse = new BookSuccessResponse();
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    //TODO: Make Service layer call
                    Book book = bookService.getBookById(bookId);

                    //TODO: Populate bookSuccessResponse object here
                }
            }
        });
        return new ResponseEntity<>(bookSuccessResponse, HttpStatus.OK);
    }

}
