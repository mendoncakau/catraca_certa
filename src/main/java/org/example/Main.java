package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleAcesso controle = new ControleAcesso();

        int count = 0;
        while (count < 5) {
            try {
                System.out.print("Digite o código do crachá: ");
                String input = scanner.nextLine();
                int codigo = Integer.parseInt(input);
                controle.registrarAcesso(codigo);
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }

        scanner.close();
    }
}
