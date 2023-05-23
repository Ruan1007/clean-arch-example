package com.cleanarchexample.application.models.responses;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProdutoResponse {
    private Long id;

    private String nome;

    private String sigla;

    private BigDecimal valor;
}
