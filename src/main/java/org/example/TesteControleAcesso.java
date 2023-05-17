package org.example;

import java.util.Scanner;

public class TesteControleAcesso {

    public static void main(String[] args) {
        ControleAcesso controleAcesso = new ControleAcesso();
        Scanner scanner = new Scanner(System.in);

        int[] codigos = { 123, 456, 789, 987, 654 }; // Valores fixos para os códigos

        for (int codigo : codigos) {
            controleAcesso.registrarAcesso(codigo);
        }

        scanner.close();
    }

}
