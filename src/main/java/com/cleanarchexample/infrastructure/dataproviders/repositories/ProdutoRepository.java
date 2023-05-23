package com.cleanarchexample.infrastructure.dataproviders.repositories;

import com.cleanarchexample.infrastructure.dataproviders.repositories.entities.ProdutoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoData, Long> {
}
