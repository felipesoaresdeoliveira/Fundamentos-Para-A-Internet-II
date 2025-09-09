package com.mycompany.naomexersenaoforofelipe;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
public class Main {

    private String senha;
    private String mensagem;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

 

    public void validarSenha() {
        if (senha == null) {
            mensagem = "Digite uma senha.";
            return;
        }
        if (senha.length() < 8) {
            mensagem = "A senha deve ter pelo menos 8 caracteres.";
            return;
        }
        if (senha.contains(" ")) {
            mensagem = "A senha não pode conter espaços.";
            return;
        }
        mensagem = "Senha válida!";
    }
}
