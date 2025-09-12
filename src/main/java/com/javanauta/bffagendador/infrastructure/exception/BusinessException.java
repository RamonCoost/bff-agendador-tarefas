package com.javanauta.bffagendador.infrastructure.exception;


public class BusinessException extends RuntimeException {

    public BusinessException(String mensagem) {
        super(mensagem);
    }

    public BusinessException(String mensagem, Throwable thorwable) {
        super(mensagem, thorwable);
    }
}
