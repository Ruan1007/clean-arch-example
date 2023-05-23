package com.cleanarchexample.domain.entities;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProdutoEntity {
    private Long id;
    private String nome;
    private String sigla;
    private BigDecimal valor;
}
