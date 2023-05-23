package com.cleanarchexample.infrastructure.dataproviders;

import com.cleanarchexample.domain.entities.ProdutoEntity;
import com.cleanarchexample.domain.exceptions.BusinessException;
import com.cleanarchexample.domain.gateways.ProdutoGateway;
import com.cleanarchexample.infrastructure.dataproviders.mappers.ProdutoDataMapper;
import com.cleanarchexample.infrastructure.dataproviders.repositories.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProdutoDataProvider implements ProdutoGateway {

    private final ProdutoDataMapper mapper;
    private final ProdutoRepository produtoRepository;

    @Override
    public List<ProdutoEntity> getAll() {
        return mapper.toEntities(produtoRepository.findAll());
    }

    @Override
    public ProdutoEntity getProdutoById(Long id) {
        return mapper.toEntity(produtoRepository.findById(id).orElseThrow(() -> {
            throw new BusinessException(String.format("Produto não encontrado pelo id informado: %d", id));
        }));
    }

    @Override
    public ProdutoEntity create(ProdutoEntity produtoEntity) {
        var produto = mapper.toData(produtoEntity);
        produto = produtoRepository.save(produto);
        return mapper.toEntity(produto);
    }
}
