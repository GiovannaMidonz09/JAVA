package org.example.intemediario.dezX.interfac;

import org.example.intemediario.dezX.model.Ninja;
import org.example.intemediario.dezX.service.Crud;

import java.util.Scanner;

public class TerceiroDesafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Crud sistema = new Crud();
        int option = 1;
        while (option != 0){
            System.out.println("1 - Adicionar Ninja");
            System.out.println("2 - Alterar Ninja");
            System.out.println("3 - Exibir Ninja");
            System.out.println("4 - Remover Ninja");
            System.out.println("0 - Sair");
            System.out.println("------------ESCOLHA UMA OPÇÃO------------");
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Nome:");
                    String nome = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Idade:");
                    int idade = sc.nextInt();
                    System.out.println("Missão:");
                    String missao = sc.nextLine();
                    sc.nextLine();
                    System.out.println("statusMisao:");
                    String statusMissao = sc.nextLine();
                    System.out.println("Nivel de Dificuldade ");
                    String nivelDificuldade = sc.nextLine();
                    System.out.println("adicionado com sucesso!");
                    System.out.println("-----------------------------");
                    Ninja novoNinja = new Ninja(nome, idade, missao, statusMissao, nivelDificuldade);
                    sistema.adicionar(novoNinja);
                    break;
                case 2:
                    sistema.exibirTodos();
                    System.out.print("Digite o índice para alterar: ");
                    int idxAlt = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = sc.nextLine();
                    sistema.alterarNome(idxAlt, novoNome);
                    break;
                case 3:
                    sistema.exibirTodos();
                    System.out.print("Digite o índice para alterar: ");
                    idxAlt = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Novo nome: ");
                    novoNome = sc.nextLine();
                    sistema.alterarNome(idxAlt, novoNome);
                    break;
                case 4:
                    sistema.exibirTodos();
                    System.out.print("Digite o índice para remover: ");
                    int idxRem = sc.nextInt();
                    sistema.remover(idxRem);
                    break;
                case 0:
                    System.out.println("sair");
                    break;
                default:
                    System.out.println("tente novamente");
                    break;
            }
        }
    }
}