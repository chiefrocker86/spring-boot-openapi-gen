package org.fkeller.spring.boot.openapi.gen.rest;

import org.fkeller.spring.boot.openapi.gen.rest.model.Get400Response;
import org.fkeller.spring.boot.openapi.gen.rest.model.IndexMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link HelloApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public interface HelloApiDelegate {

    /**
     * GET /
     * requests the index message
     *
     * @return Successfully got the index message (status code 200)
     *         or Invalid request (status code 400)
     * @see HelloApi#rootGet
     */
    ResponseEntity<IndexMessage> rootGet();

}
