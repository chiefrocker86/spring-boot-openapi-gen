package org.fkeller.spring.boot.openapi.gen.service;

import org.fkeller.spring.boot.openapi.gen.service.model.Message;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageServiceImplConfiguration {

    @ConfigurationProperties(prefix = "message")
    @Bean
    public Message message() {
        return new Message();
    }

}
