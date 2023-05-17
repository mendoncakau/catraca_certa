package org.example;

import java.util.ArrayList;

public class TesteControleAcesso {

    public static void main(String[] args) {
        ControleAcesso controleAcesso = new ControleAcesso();

        // Simula valores de entrada
        String[] valoresEntrada = {"1", "2", "3", "sair"};

        System.out.println("Bem-vindo ao Teste do Controle de Acesso");

        for (String valor : valoresEntrada) {
            if (valor.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o teste...");
                break;
            }

            try {
                int codigo = Integer.parseInt(valor);
                controleAcesso.registrarAcesso(codigo);
            } catch (NumberFormatException e) {
                System.out.println("Código inválido. Tente novamente.");
            }
        }
    }
}
