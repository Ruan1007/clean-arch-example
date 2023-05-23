package com.cleanarchexample.domain.exceptions;

public class BusinessException extends RuntimeException {

    private static final String MENSAGEM_PADRAO = "Ocorreu algum erro de negócio";

    public BusinessException() {
        super(MENSAGEM_PADRAO);
    }

    public BusinessException(String mensagem) {
        super(mensagem);
    }
}
