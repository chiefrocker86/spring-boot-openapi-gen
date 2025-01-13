package org.fkeller.spring.boot.openapi.gen.service;

import org.fkeller.spring.boot.openapi.gen.service.model.IndexMessage;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloServiceImplConfiguration {

    @ConfigurationProperties(prefix = "index.message")
    @Bean
    public IndexMessage indexMessage(){
        return new IndexMessage();
    }

}
