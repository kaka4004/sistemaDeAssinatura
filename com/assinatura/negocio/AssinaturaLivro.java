package com.assinatura.negocio;

import com.assinatura.excecoes.QuantidadeInvalidaException;

public class AssinaturaLivro extends Assinatura {
    private int livrosLidos;
    private static final double VALOR_POR_LIVRO = 4.99;

    public AssinaturaLivro(String cliente, int duracaoMeses, int livrosLidos) {
        super(cliente, duracaoMeses);
        if (livrosLidos < 0) {
            throw new QuantidadeInvalidaException("Quantidade de livros lidos não pode ser negativa.");
        }
        this.livrosLidos = livrosLidos;
    }

    @Override
    public double calcularMensalidade() {
        return livrosLidos * VALOR_POR_LIVRO;
    }
}
