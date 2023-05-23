package com.cleanarchexample.application.models.requests;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProdutoRequest {
    private Long id;
    private String nome;
    private String sigla;
    private BigDecimal valor;
}
