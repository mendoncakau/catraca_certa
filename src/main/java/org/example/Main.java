package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleAcesso controleAcesso = new ControleAcesso();

        System.out.println("Hello world");
        System.out.println("Digite o código de acesso:");
        int codigoAcesso = scanner.nextInt();
        controleAcesso.registrarAcesso(codigoAcesso);

        scanner.close();
    }
}
