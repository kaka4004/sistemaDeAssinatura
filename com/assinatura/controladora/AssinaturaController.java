package com.assinatura.controladora;

import com.assinatura.negocio.Assinatura;
import com.assinatura.negocio.servicoAssinatura;
import java.util.ArrayList;

public class AssinaturaController {
    private ArrayList<servicoAssinatura> assinaturas;

    public AssinaturaController() {
        this.assinaturas = new ArrayList<>();
    }

    public void cadastrarAssinatura(servicoAssinatura assinatura) {
        if (assinatura != null) {
            assinaturas.add(assinatura);
            System.out.println("Assinatura cadastrada com sucesso.");
        } else {
            System.out.println("Assinatura inválida.");
        }
    }

    public void listarAssinaturas() {
        if (assinaturas.isEmpty()) {
            System.out.println("Nenhuma assinatura cadastrada.");
            return;
        }
        for (servicoAssinatura a : assinaturas) {
            if (a instanceof Assinatura) {
                Assinatura ass = (Assinatura) a;
                System.out.println("Cliente: " + ass.getCliente() +
                                   " | Duração: " + ass.getDuracaoMeses() + " meses" +
                                   " | Mensalidade: R$" + a.calcularMensalidade());
            }
        }
    }

    public double calcularTotalMensalidadeCliente(String cliente) {
        double total = 0.0;
        for (servicoAssinatura a : assinaturas) {
            if (a instanceof Assinatura) {
                Assinatura ass = (Assinatura) a;
                if (ass.getCliente().equalsIgnoreCase(cliente)) {
                    total += a.calcularMensalidade();
                }
            }
        }
        return total;
    }
}
