package org.example;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ControleAcesso {

    private ArrayList<RegistroAcesso> registros;
    private int totalPassagens;

    public ControleAcesso() {
        registros = new ArrayList<>();
        totalPassagens = 0;
    }

    public void registrarAcesso(int codigo) {
        boolean codigoJaExiste = false;
        for (RegistroAcesso registro : registros) {
            if (registro.getCodigo() == codigo) {
                codigoJaExiste = true;
                break;
            }
        }

        if (!codigoJaExiste) {
            totalPassagens = 0; // Reiniciar a contagem quando um número diferente é digitado
        }

        totalPassagens++;
        String mensagem = (totalPassagens % 2 == 1) ? "Bem-vindo, acesso liberado" : "Obrigado pela visita";
        Date horaAcesso = new Date();
        registros.add(new RegistroAcesso(codigo, horaAcesso));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(dateFormat.format(horaAcesso) + ": " + mensagem);
    }

    public ArrayList<RegistroAcesso> getRegistros() {
        return registros;
    }

    public void reiniciarContagem(int codigo) {
        for (RegistroAcesso registro : registros) {
            if (registro.getCodigo() == codigo) {
                registros.remove(registro);
                break;
            }
        }
    }
}

class RegistroAcesso {

    private int codigo;
    private Date dataAcesso;

    public RegistroAcesso(int codigo, Date dataAcesso) {
        this.codigo = codigo;
        this.dataAcesso = dataAcesso;
    }

    public int getCodigo() {
        return codigo;
    }

    public Date getDataAcesso() {
        return dataAcesso;
    }

    public String getDataAcessoFormatada() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return dateFormat.format(dataAcesso);
    }
}