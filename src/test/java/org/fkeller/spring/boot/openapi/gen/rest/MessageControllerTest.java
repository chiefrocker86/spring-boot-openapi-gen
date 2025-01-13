package org.fkeller.spring.boot.openapi.gen.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.fkeller.spring.boot.openapi.gen.mapper.RestServiceMapper;
import org.fkeller.spring.boot.openapi.gen.service.MessageService;
import org.fkeller.spring.boot.openapi.gen.service.model.Message;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Testing {@link MessageController}
 */
@WebMvcTest(MessageController.class)
class MessageControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockitoBean
    private MessageService messageService;

    @MockitoBean
    private RestServiceMapper restServiceMapper;

    @Autowired
    private ObjectMapper objectMapper;

    //Welcome to spring-boot-openapi-gen!
    @Test
    void whenMessageThenReturnOK()
            throws Exception {

        String expectedValue = "Welcome to spring-boot-openapi-gen!";
        Message message = new Message();
        message.setValue(expectedValue);
        org.fkeller.spring.boot.openapi.gen.rest.model.Message expectedMessage = new org.fkeller.spring.boot.openapi.gen.rest.model.Message(expectedValue);

        when(messageService.message()).thenReturn(message);
        when(restServiceMapper.serviceMessageToRestMessage(message)).thenReturn(expectedMessage);

        MvcResult result = mvc.perform(get("/messages")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String json = result.getResponse().getContentAsString();
        Message actualMessage = objectMapper.readValue(json, Message.class);

        assertNotNull(actualMessage);
        assertEquals(expectedValue, actualMessage.getValue());

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
