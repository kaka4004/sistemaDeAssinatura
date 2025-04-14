package com.assinatura.negocio;

public class AssinaturaSoftware extends Assinatura {
    private int modulos;
    private static final double VALOR_BASE = 49.90;
    private static final double VALOR_POR_MODULO = 10.00;

    public AssinaturaSoftware(String cliente, int duracaoMeses, int modulos) {
        super(cliente, duracaoMeses);
        if (modulos < 0) {
            throw new IllegalArgumentException("Número de módulos não pode ser negativo.");
        }
        this.modulos = modulos;
    }

    @Override
    public double calcularMensalidade() {
        return VALOR_BASE + (modulos * VALOR_POR_MODULO);
    }
}
