package com.assinatura.negocio;

public abstract class Assinatura implements ServicoAssinatura {
    private String cliente;
    private int duracaoMeses;

    public Assinatura(String cliente, int duracaoMeses) {
        if (cliente == null || cliente.isEmpty()) {
            throw new IllegalArgumentException("Cliente não pode ser vazio.");
        }
        if (duracaoMeses <= 0) {
            throw new IllegalArgumentException("Duração deve ser maior que 0.");
        }
        this.cliente = cliente;
        this.duracaoMeses = duracaoMeses;
    }

    public String getCliente() {
        return cliente;
    }

    public int getDuracaoMeses() {
        return duracaoMeses;
    }
}
