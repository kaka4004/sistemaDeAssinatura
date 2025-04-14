package com.assinatura.dados;

import com.assinatura.negocio.ServicoAssinatura;
import java.util.ArrayList;
import java.util.List;

public class AssinaturaRepositorio {
    private List<ServicoAssinatura> listaAssinaturas = new ArrayList<>();

    public void adicionar(ServicoAssinatura assinatura) {
        listaAssinaturas.add(assinatura);
    }

    public List<ServicoAssinatura> listar() {
        return new ArrayList<>(listaAssinaturas);
    }
}