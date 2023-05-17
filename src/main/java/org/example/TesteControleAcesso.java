package org.example;

public class TesteControleAcesso {

    public static void main(String[] args) {
        ControleAcesso controleAcesso = new ControleAcesso();
        controleAcesso.registrarAcesso(1);
        controleAcesso.registrarAcesso(2);
        controleAcesso.registrarAcesso(3);
        controleAcesso.registrarAcesso(4);
        controleAcesso.registrarAcesso(5);
    }

}
