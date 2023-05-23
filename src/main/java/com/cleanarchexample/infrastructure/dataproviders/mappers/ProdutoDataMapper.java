package com.cleanarchexample.infrastructure.dataproviders.mappers;

import com.cleanarchexample.domain.entities.ProdutoEntity;
import com.cleanarchexample.infrastructure.dataproviders.repositories.entities.ProdutoData;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProdutoDataMapper {

    ProdutoData toData(ProdutoEntity produtoEntity);

    ProdutoEntity toEntity(ProdutoData produtoData);

    List<ProdutoEntity> toEntities(List<ProdutoData> produtos);
}
