package org.example.iniciante;


import org.example.model.Ninja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioCadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroMax = 3;

         String[] ninjas = new String[numeroMax];
        int ninjasCadastrados =0;
         int opcoes = 0;
        while (opcoes != 3){
            System.out.println("====Meu ninja===");
            System.out.println("1 - cadastrar ninja");
            System.out.println("2 - Listar ninjas");
            System.out.println("3 - Sair do programa");
            System.out.println("Escolha uma opção:");
            opcoes = sc.nextInt();
            sc.nextLine();
            switch (opcoes){
                case 1:
                    if (ninjasCadastrados < numeroMax){
                        System.out.println("informe o nome do ninja");
                        String nome = sc.nextLine();
                        ninjas[ninjasCadastrados] = nome;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    }else{
                        System.out.println("A lista está cheia!");

                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0){
                        System.out.println("Nenhum ninja cadastrado");
                    }else{
                        System.out.println("lista de ninjas");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println("Ninja: "+ ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;

            }


        }

        sc.close();
    }
}
