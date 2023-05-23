package com.cleanarchexample.application.usecases.impl;

import com.cleanarchexample.application.mappers.ProdutoMapper;
import com.cleanarchexample.application.models.requests.ProdutoRequest;
import com.cleanarchexample.application.models.responses.ProdutoResponse;
import com.cleanarchexample.application.usecases.ProdutoUseCase;
import com.cleanarchexample.domain.gateways.ProdutoGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProdutoUseCaseImpl implements ProdutoUseCase {

    private final ProdutoGateway produtoGateway;
    private final ProdutoMapper mapper;

    @Override
    public List<ProdutoResponse> getAll() {
        var produtos = produtoGateway.getAll();
        return mapper.toResponses(produtos);
    }

    @Override
    public ProdutoResponse getProdutoById(Long id) {
        var produto = produtoGateway.getProdutoById(id);
        return mapper.toResponse(produto);
    }

    @Override
    public ProdutoResponse create(ProdutoRequest request) {
        var produto = mapper.toEntity(request);
        produto = produtoGateway.create(produto);
        return mapper.toResponse(produto);
    }
}
