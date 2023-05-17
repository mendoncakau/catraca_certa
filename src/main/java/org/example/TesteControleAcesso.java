package org.example;

import java.util.ArrayList;

public class TesteControleAcesso {

    public static void main(String[] args) {
        ControleAcesso controle = new ControleAcesso();

        int[] codigos = { 123, 456, 789, 123, 789};

        for (int codigo : codigos) {
            if (codigo > 0) {
                controle.registrarAcesso(codigo);
            } else {
                System.out.println("Código inválido: " + codigo);
            }
        }
    }
}
