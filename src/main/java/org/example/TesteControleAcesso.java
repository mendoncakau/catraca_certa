package org.example;

import java.util.ArrayList;

public class TesteControleAcesso {

    public static void main(String[] args) {
        ControleAcesso controleAcesso = new ControleAcesso();

        // Simulação de registros de acesso
        controleAcesso.registrarAcesso(123);
        controleAcesso.registrarAcesso(456);
        controleAcesso.registrarAcesso(789);

        // Obtendo os registros de acesso
        ArrayList<RegistroAcesso> registros = controleAcesso.getRegistros();

        // Exibindo os registros de acesso
        System.out.println("Registros de Acesso:");
        for (RegistroAcesso registro : registros) {
            System.out.println("Código: " + registro.getCodigo());
            System.out.println("Data de Acesso: " + registro.getDataAcessoFormatada());
            System.out.println();
        }
    }
}
