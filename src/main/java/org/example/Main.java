package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleAcesso controle = new ControleAcesso();

        for (int i = 0; i < 5; i++) {
            try {
                System.out.print("Digite o código do crachá: ");
                int codigo = scanner.nextInt();
                controle.registrarAcesso(codigo);
            } catch (Exception e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.nextLine(); // Limpar a entrada inválida do scanner
                i--; // Decrementar o contador para repetir a iteração
            }
        }

        scanner.close();
    }
}
