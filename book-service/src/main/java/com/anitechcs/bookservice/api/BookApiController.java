package com.anitechcs.bookservice.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import io.swagger.annotations.Api;

import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Controller
@Api(value = "book", description = "the book API", tags = {"Book-Service"})
@RequestMapping("${openapi.bookServiceAPISpecification.base-path:/v1}")
public class BookApiController implements BookApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BookApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
