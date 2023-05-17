package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleAcesso controle = new ControleAcesso();

        while (true) {
            try {
                System.out.print("Digite o código do crachá: ");
                int codigo = scanner.nextInt();
                controle.registrarAcesso(codigo);
                scanner.nextLine(); // Consumir o caractere de nova linha
            } catch (Exception e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.nextLine(); // limpa a entrada inválida do scanner
            }

        }
    }
}
