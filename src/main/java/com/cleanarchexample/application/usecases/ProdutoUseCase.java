package com.cleanarchexample.application.usecases;

import com.cleanarchexample.application.models.requests.ProdutoRequest;
import com.cleanarchexample.application.models.responses.ProdutoResponse;

import java.util.List;

public interface ProdutoUseCase {

    List<ProdutoResponse> getAll();

    ProdutoResponse getProdutoById(Long id);

    ProdutoResponse create(ProdutoRequest request);
}
