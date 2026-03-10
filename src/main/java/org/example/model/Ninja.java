package org.example.model;

public class Ninja {

    private String name;
    private int idade;
    private String missao;
    private String nomeDaMissao;
    private int nivelDificuldade;
    private boolean statusConclusao;
    private String rank;
    private int numeroDeMissao;

    public Ninja(String name, int idade, String missao, String nomeDaMissao, int nivelDificuldade, boolean statusConclusão,int rank) {
        this.name = name;
        this.idade = idade;
        this.missao = missao;
        this.nomeDaMissao = nomeDaMissao;
        this.nivelDificuldade = verificarNivelDificuldade();
        this.statusConclusao = statusConclusao;
        this.rank = rank(numeroDeMissao,idade);
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

    public boolean isStatusConclusao() {
        return statusConclusao;
    }

    public void setStatusConclusao(boolean statusConclusao) {
        this.statusConclusao = statusConclusao;
    }

    public String rank(int numeroDeMissoes, int idade){
        if(numeroDeMissoes == 10 && idade > 15){
            return "Rank: Chunnin";

        } else if (numeroDeMissoes >= 20) {
            return "Rank: Jounin ";
        }else{
            return "Rank: Gennim";
        }
    }
    public int verificarNivelDificuldade() {
      return  (idade < 18) ? 1 : 2;
    }
    public String status(){
        if(statusConclusao == true){
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
                " | Status: " + status() +
                " | Rank: " + rank(numeroDeMissao, idade);
    }
}
