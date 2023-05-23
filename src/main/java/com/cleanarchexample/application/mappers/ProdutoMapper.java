package com.cleanarchexample.application.mappers;

import com.cleanarchexample.application.models.requests.ProdutoRequest;
import com.cleanarchexample.application.models.responses.ProdutoResponse;
import com.cleanarchexample.domain.entities.ProdutoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    ProdutoEntity toEntity(ProdutoRequest request);
    ProdutoResponse toResponse(ProdutoEntity produtoEntity);
    List<ProdutoResponse> toResponses(List<ProdutoEntity> produtoEntities);
}
