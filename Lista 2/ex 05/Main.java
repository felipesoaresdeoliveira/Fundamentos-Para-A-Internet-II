package com.mycompany.naomexersenaoforofelipe;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Main {

    private double temperatura;
    private String mensagem;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void verificarTemperatura() {
        if (temperatura >= 20 && temperatura <= 30) {
            mensagem = "Temperatura confortável.";
        } else {
            mensagem = "Temperatura fora do intervalo confortável.";
        }
    }
}
