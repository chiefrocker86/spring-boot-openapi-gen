package org.fkeller.spring.boot.openapi.gen.rest;

import lombok.RequiredArgsConstructor;
import org.fkeller.spring.boot.openapi.gen.mapper.RestServiceMapper;
import org.fkeller.spring.boot.openapi.gen.rest.model.IndexMessage;
import org.fkeller.spring.boot.openapi.gen.service.HelloService;

@RequiredArgsConstructor
public class HelloDelegateImpl {

    private final HelloService helloService;
    private final RestServiceMapper restServiceMapper;

    public IndexMessage index() {

        return restServiceMapper.serviceIndexMessageToRestIndexMessage(helloService.index());

    }

}
