package org.fkeller.spring.boot.openapi.gen.rest;

import org.fkeller.spring.boot.openapi.gen.rest.model.Get400Response;
import org.fkeller.spring.boot.openapi.gen.rest.model.IndexMessage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
@Controller
@RequestMapping("${openapi.sample.base-path:}")
public class HelloApiController implements HelloApi {

    private final HelloApiDelegate delegate;

    public HelloApiController(@Autowired(required = false) HelloApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new HelloApiDelegate() {});
    }

    @Override
    public HelloApiDelegate getDelegate() {
        return delegate;
    }

}
