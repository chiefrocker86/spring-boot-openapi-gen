package org.fkeller.spring.boot.openapi.gen.rest;

import jakarta.annotation.Generated;
import org.fkeller.spring.boot.openapi.gen.rest.model.Message;
import org.springframework.http.ResponseEntity;

/**
 * A delegate to be called by the {@link MessageApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public interface MessageApiDelegate {

    /**
     * GET /message
     * requests the message
     *
     * @return Successfully got the message (status code 200)
     * @see MessageApi#messageGet
     */
    ResponseEntity<Message> messageGet();

}
