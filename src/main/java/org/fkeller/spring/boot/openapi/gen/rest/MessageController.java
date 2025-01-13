package org.fkeller.spring.boot.openapi.gen.rest;

import lombok.RequiredArgsConstructor;
import org.fkeller.spring.boot.openapi.gen.mapper.RestServiceMapper;
import org.fkeller.spring.boot.openapi.gen.rest.model.Message;
import org.fkeller.spring.boot.openapi.gen.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("messages")
@RestController
public class MessageController {

    private final MessageService messageService;
    private final RestServiceMapper restServiceMapper;

    @GetMapping
    public Message message() {

        return restServiceMapper.serviceMessageToRestMessage(messageService.message());

    }

}
