package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleAcesso controle = new ControleAcesso();

        while (true) {
            try {
                System.out.print("Digite o código do crachá: ");
                int codigo;
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("sair")) {
                    System.out.println("Encerrando o programa...");
                    break;
                }

                codigo = Integer.parseInt(input);
                controle.registrarAcesso(codigo);
            } catch (NumberFormatException e) {
                System.out.println("Código inválido. Tente novamente.");
            }
        }

        scanner.close();
    }
}