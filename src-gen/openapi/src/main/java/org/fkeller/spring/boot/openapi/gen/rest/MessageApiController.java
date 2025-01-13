package org.fkeller.spring.boot.openapi.gen.rest;

import jakarta.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
@Controller
@RequestMapping("${openapi.sample.base-path:}")
public class MessageApiController implements MessageApi {

    private final MessageApiDelegate delegate;

    public MessageApiController(@Autowired(required = false) MessageApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new MessageApiDelegate() {
        });
    }

    @Override
    public MessageApiDelegate getDelegate() {
        return delegate;
    }

}
