package org.fkeller.spring.boot.openapi.gen.rest;

import org.fkeller.spring.boot.openapi.gen.mapper.RestServiceMapper;
import org.fkeller.spring.boot.openapi.gen.rest.model.IndexMessage;
import org.fkeller.spring.boot.openapi.gen.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class HelloController {

    private final HelloService helloService;
    private final RestServiceMapper restServiceMapper;

    @GetMapping("/")
    public IndexMessage index() {

        return restServiceMapper.serviceIndexMessageToRestIndexMessage(helloService.index());

    }

}
