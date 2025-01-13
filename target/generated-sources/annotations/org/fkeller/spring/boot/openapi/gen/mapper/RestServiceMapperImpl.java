package org.fkeller.spring.boot.openapi.gen.mapper;

import javax.annotation.processing.Generated;
import org.fkeller.spring.boot.openapi.gen.rest.model.IndexMessage;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-13T17:03:22+0100",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.5 (Oracle Corporation)"
)
@Component
public class RestServiceMapperImpl implements RestServiceMapper {

    @Override
    public org.fkeller.spring.boot.openapi.gen.service.model.IndexMessage restIndexMessageToServiceIndexMessage(IndexMessage indexMessage) {
        if ( indexMessage == null ) {
            return null;
        }

        org.fkeller.spring.boot.openapi.gen.service.model.IndexMessage indexMessage1 = new org.fkeller.spring.boot.openapi.gen.service.model.IndexMessage();

        indexMessage1.setValue( indexMessage.value() );

        return indexMessage1;
    }

    @Override
    public IndexMessage serviceIndexMessageToRestIndexMessage(org.fkeller.spring.boot.openapi.gen.service.model.IndexMessage indexMessage) {
        if ( indexMessage == null ) {
            return null;
        }

        String value = null;

        value = indexMessage.getValue();

        IndexMessage indexMessage1 = new IndexMessage( value );

        return indexMessage1;
    }
}
