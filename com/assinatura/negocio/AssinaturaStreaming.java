package com.assinatura.negocio;

public class AssinaturaStreaming extends Assinatura {
    private int telasExtras;
    private static final double VALOR_BASE = 29.90;
    private static final double VALOR_POR_TELA = 5.00;

    public AssinaturaStreaming(String cliente, int duracaoMeses, int telasExtras) {
        super(cliente, duracaoMeses);
        if (telasExtras < 0) {
            throw new IllegalArgumentException("Número de telas extras não pode ser negativo.");
        }
        this.telasExtras = telasExtras;
    }

    @Override
    public double calcularMensalidade() {
        return VALOR_BASE + (telasExtras * VALOR_POR_TELA);
    }
}
