package org.example.iniciante;

import org.example.model.Ninja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Ninja> listaDeNinjas = new ArrayList<>();
        for (int i = 0; i < 1 ; i++){
            System.out.println("--CADASTRO DO " + (i + 1) +"º NINJAS--");

            System.out.println("Qual é o nome:");
            String nome = sc.nextLine();

            System.out.println("Qual é a sua idade:");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.println("Qual é sua missão:");
            String missao = sc.nextLine();

            int nivelDificuldade = 3;
            Boolean status = true;

            System.out.println("Qual é o nome da missão:");
            String nomeMissao = sc.nextLine();

            System.out.println("Informe qual é o número total de missões realizadas:");
            int rank = sc.nextInt();
            sc.nextLine();
            Ninja ninja = new Ninja(nome, idade,missao,nomeMissao,nivelDificuldade,status, rank);

            listaDeNinjas.add(ninja);
        }

        System.out.println("---DADOS DO NINJA---");
       for(Ninja n :listaDeNinjas){
           System.out.println(n);
       }

       sc.close();
    }
}
