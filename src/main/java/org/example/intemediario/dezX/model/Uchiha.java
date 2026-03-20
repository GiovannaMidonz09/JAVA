package org.example.intemediario.dezX.model;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

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
