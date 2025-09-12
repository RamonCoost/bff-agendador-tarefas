package com.javanauta.bffagendador.infrastructure.exception;


public class UnauthorizedException extends RuntimeException {

    public UnauthorizedException(String mensagem) {
        super(mensagem);
    }

    public UnauthorizedException(String mensagem, Throwable thorwable) {
        super(mensagem, thorwable);
    }
}
