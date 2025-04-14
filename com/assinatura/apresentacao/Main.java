package com.assinatura.apresentacao;

import com.assinatura.controladora.AssinaturaController;
import com.assinatura.negocio.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AssinaturaController controller = new AssinaturaController();
        Scanner scanner = new Scanner(System.in);

        boolean executando = true;
        while (executando) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Assinatura");
            System.out.println("2. Listar Assinaturas");
            System.out.println("3. Calcular Total de Mensalidade");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do cliente: ");
                    String cliente = scanner.nextLine();

                    System.out.println("Tipo de assinatura: 1-Streaming, 2-Software, 3-Livros");
                    int tipo = scanner.nextInt();

                    System.out.print("Duração (meses): ");
                    int duracao = scanner.nextInt();

                    servicoAssinatura assinatura = null;
                    switch (tipo) {
                        case 1:
                            System.out.print("Telas extras: ");
                            int telas = scanner.nextInt();
                            assinatura = new AssinaturaStreaming(cliente, duracao, telas);
                            break;
                        case 2:
                            System.out.print("Módulos contratados: ");
                            int modulos = scanner.nextInt();
                            assinatura = new AssinaturaSoftware(cliente, duracao, modulos);
                            break;
                        case 3:
                            System.out.print("Livros lidos: ");
                            int livros = scanner.nextInt();
                            assinatura = new AssinaturaLivro(cliente, duracao, livros);
                            break;
                        default:
                            System.out.println("Tipo inválido.");
                    }
                    controller.cadastrarAssinatura(assinatura);
                    break;
                case 2:
                    controller.listarAssinaturas();
                    break;
                case 3:
                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();
                    double total = controller.calcularTotalMensalidadeCliente(nome);
                    System.out.printf("Total de mensalidades: R$%.2f\n", total);
                    break;
                case 4:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
