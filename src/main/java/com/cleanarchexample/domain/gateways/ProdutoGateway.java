package com.cleanarchexample.domain.gateways;

import com.cleanarchexample.domain.entities.ProdutoEntity;

import java.util.List;

public interface ProdutoGateway {

    List<ProdutoEntity> getAll();

    ProdutoEntity getProdutoById(Long id);

    ProdutoEntity create(ProdutoEntity produtoEntity);
}
