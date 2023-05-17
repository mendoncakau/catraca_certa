package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleAcesso controle = new ControleAcesso();

        int numIteracoes = 0;
        int maxIteracoes = 5; // Número máximo de iterações permitidas

        for (int i = 0; i < maxIteracoes; i++) {
            System.out.print("Digite o código do crachá: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa...");
                break;
            }

            try {
                int codigo = Integer.parseInt(input);

                controle.registrarAcesso(codigo);
                numIteracoes++;

                if (numIteracoes >= maxIteracoes) {
                    System.out.println("Número máximo de iterações atingido. Encerrando o programa...");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Código inválido. Tente novamente.");
                i--;
            }
        }

        scanner.close();
    }
}
