package com.assinatura.Excecoes;

public class QuantidadeInvalidaException extends RuntimeException {
    public QuantidadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}