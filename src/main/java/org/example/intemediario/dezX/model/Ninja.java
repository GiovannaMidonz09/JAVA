package org.example.intemediario.dezX.model;

public class Ninja {
    public String nome;
    public int idade;
    String missao;
    String statusMissao;
    String nivelDificuldade;

    public void mostrarInformacoes(){
        System.out.println("Nome: " + this.nome
                + "\nIdade: " + this.idade
                + "\nNível de Dificuldade: " + this.nivelDificuldade
                + "\nMissão: " + this.missao
                + "\nStatus: " + this.statusMissao);
    }

}
