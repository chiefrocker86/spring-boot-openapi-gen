package org.fkeller.spring.boot.openapi.gen.mapper;

import org.fkeller.spring.boot.openapi.gen.service.model.IndexMessage;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RestServiceMapper {

    IndexMessage restIndexMessageToServiceIndexMessage(org.fkeller.spring.boot.openapi.gen.rest.model.IndexMessage indexMessage);

    org.fkeller.spring.boot.openapi.gen.rest.model.IndexMessage serviceIndexMessageToRestIndexMessage(IndexMessage indexMessage);

}
