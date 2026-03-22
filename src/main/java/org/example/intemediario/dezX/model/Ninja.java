package org.example.intemediario.dezX.model;

import java.util.ArrayList;

public class Ninja {
    protected String nome;
    protected int idade;
    protected String missao;
    protected String statusMissao;
    protected String nivelDificuldade;

    public Ninja(String nome, int idade, String missao, String statusMissao, String nivelDificuldade) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.statusMissao = statusMissao;
        this.nivelDificuldade = nivelDificuldade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getStatusMissao() {
        return statusMissao;
    }

    public void setStatusMissao(String statusMissao) {
        this.statusMissao = statusMissao;
    }

    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(String nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", missao='" + missao + '\'' +
                ", statusMissao='" + statusMissao + '\'' +
                ", nivelDificuldade='" + nivelDificuldade + '\'' +
                '}';
    }
}
