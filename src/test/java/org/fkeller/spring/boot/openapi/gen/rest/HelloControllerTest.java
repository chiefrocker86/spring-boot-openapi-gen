package org.fkeller.spring.boot.openapi.gen.rest;

import org.fkeller.spring.boot.openapi.gen.mapper.RestServiceMapper;
import org.fkeller.spring.boot.openapi.gen.service.HelloService;
import org.fkeller.spring.boot.openapi.gen.service.model.IndexMessage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Testing {@link HelloDelegateImpl}
 */
@WebMvcTest(HelloDelegateImpl.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockitoBean
    private HelloService helloService;

    @MockitoBean
    private RestServiceMapper restServiceMapper;

    //Welcome to spring-boot-openapi-gen!
    @Test
    void whenIndexThenReturnOK()
            throws Exception {

        String expectedValue = "Welcome to spring-boot-openapi-gen!";
        IndexMessage indexMessage = new IndexMessage();
        indexMessage.setValue(expectedValue);
        org.fkeller.spring.boot.openapi.gen.rest.model.IndexMessage restIndexMessage = new org.fkeller.spring.boot.openapi.gen.rest.model.IndexMessage(expectedValue);

        when(helloService.index()).thenReturn(indexMessage);
        when(restServiceMapper.serviceIndexMessageToRestIndexMessage(indexMessage)).thenReturn(restIndexMessage);

        mvc.perform(get("/")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(expectedValue))
        ;
    }

    @Test
    void whenUndefinedRouteThenReturnNotFound()
            throws Exception {

        mvc.perform(get("/undefined-route")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound())
        ;
    }

}
