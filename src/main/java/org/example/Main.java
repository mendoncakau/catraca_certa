package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleAcesso controleAcesso = new ControleAcesso();

        int count = 0;
        while (count < 5) {
            System.out.print("Digite o código de acesso: ");
            int codigoAcesso = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            controleAcesso.registrarAcesso(codigoAcesso);
            count++;
        }

        scanner.close();
    }
}
