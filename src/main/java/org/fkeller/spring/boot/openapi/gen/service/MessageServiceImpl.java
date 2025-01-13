package org.fkeller.spring.boot.openapi.gen.service;

import lombok.RequiredArgsConstructor;
import org.fkeller.spring.boot.openapi.gen.service.model.Message;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MessageServiceImpl implements MessageService {

    private final Message message;

    @Override
    public Message message() {
        return message;
    }
}
