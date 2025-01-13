package org.fkeller.spring.boot.openapi.gen.service;

import org.fkeller.spring.boot.openapi.gen.service.model.IndexMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class HelloServiceImpl implements HelloService{

    private final IndexMessage indexMessage;

    @Override
    public IndexMessage index() {
        return indexMessage;
    }
}
