package org.fkeller.spring.boot.openapi.gen.rest;

import lombok.RequiredArgsConstructor;
import org.fkeller.spring.boot.openapi.gen.mapper.RestServiceMapper;
import org.fkeller.spring.boot.openapi.gen.rest.model.Message;
import org.fkeller.spring.boot.openapi.gen.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("messages")
@Controller
public class MessageController {

    private final MessageService messageService;
    private final RestServiceMapper restServiceMapper;

    @GetMapping
    public ResponseEntity<Message> messageGet() {

        return ResponseEntity.ok(restServiceMapper.serviceMessageToRestMessage(messageService.message()));

    }

}
