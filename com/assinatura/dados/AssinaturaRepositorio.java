package com.assinatura.dados;

import com.assinatura.negocio.servicoAssinatura;
import java.util.ArrayList;
import java.util.List;

public class AssinaturaRepositorio {
    private List<servicoAssinatura> listaAssinaturas = new ArrayList<>();

    public void adicionar(servicoAssinatura assinatura) {
        listaAssinaturas.add(assinatura);
    }

    public List<servicoAssinatura> listar() {
        return new ArrayList<>(listaAssinaturas);
    }
}