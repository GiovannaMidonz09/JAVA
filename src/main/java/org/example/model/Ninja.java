package org.example.model;

public class Ninja {

    private String name;
    private int idade;
    private String missao;
    private String nomeDaMissao;
    private int nivelDificuldade;
    private boolean statusConclusão;

    public Ninja(String name, int idade, String missao, String nomeDaMissao, int nivelDificuldade, boolean statusConclusão) {
        this.name = name;
        this.idade = idade;
        this.missao = missao;
        this.nomeDaMissao = nomeDaMissao;
        this.nivelDificuldade = verificarNivelDificuldade();
        this.statusConclusão = statusConclusão;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getNomeDaMissao() {
        return nomeDaMissao;
    }

    public void setNomeDaMissao(String nomeDaMissao) {
        this.nomeDaMissao = nomeDaMissao;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public boolean isStatusConclusão() {
        return statusConclusão;
    }

    public void setStatusConclusão(boolean statusConclusão) {
        this.statusConclusão = statusConclusão;
    }

    public int verificarNivelDificuldade(){
        if(idade<18){
            return 1;
        }else {
            return 2;
        }
    }

    public String status(){
        if(statusConclusão == true){
            return "Concluído";
        }else {
            return "Incompleto";
        }
    }

    @Override
    public String toString() {
        return "Ninja: " + name +
                " | Idade: " + idade +
                " | Missão: " + nomeDaMissao +
                " | Dificuldade: " + nivelDificuldade +
                " | Status: " + status();
    }
}
