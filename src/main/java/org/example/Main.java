package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleAcesso controle = new ControleAcesso();

        int numIteracoes = 0;
        int maxIteracoes = 5; // Número máximo de iterações permitidas

        for (int i = 0; i < maxIteracoes; i++) {
            try {
                System.out.print("Digite o código do crachá: ");
                int codigo;
                if (scanner.hasNextInt()) {
                    codigo = scanner.nextInt();
                    controle.registrarAcesso(codigo);
                    numIteracoes++;

                    if (numIteracoes >= maxIteracoes) {
                        System.out.println("Número máximo de iterações atingido. Encerrando o programa...");
                        break;
                    }
                } else {
                    System.out.println("Entrada inválida. Tente novamente.");
                    i--;
                    scanner.nextLine(); // Limpar o buffer do scanner
                }
            } catch (NumberFormatException e) {
                System.out.println("Código inválido. Tente novamente.");
                i--;
                scanner.nextLine(); // Limpar o buffer do scanner
            }
        }

        scanner.close();
    }
}
