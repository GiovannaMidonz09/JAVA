package org.example.intemediario.dezX.model;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public Uchiha(String nome, int idade, String missao, String statusMissao, String nivelDificuldade) {
        super(nome, idade, missao, statusMissao, nivelDificuldade);
    }

    public void mostrarHabilidadeEspecial(){
        System.out.println("Possuo habilidade especial ");
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: " + this.nome
                + "\nHabilidade: " + this.habilidadeEspecial
                + "\nIdade: " + this.idade
                + "\nNível de Dificuldade: " + this.nivelDificuldade
                + "\nMissão: " + this.missao
                + "\nStatus: " + this.statusMissao);
    }
}
