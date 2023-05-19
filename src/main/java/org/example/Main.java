package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleAcesso controleAcesso = new ControleAcesso();

        System.out.println("Hello word");
        System.out.println("Passe o crachá");
        scanner.nextLine();
    }
}
