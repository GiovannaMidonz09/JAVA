package org.example.intemediario.dezX;

import java.util.Scanner;

//adicionar
//remover
//alterar
//ler
//sair
public class Crud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 1;

        while (option != 0){
            System.out.println("----------CRUD----------");
            System.out.println("------------ESCOLHA UMA OPÇÃO ABAIXO------------");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Alterar");
            System.out.println("3 - Exibir");
            System.out.println("4 - Remover");
            System.out.println("0 - Sair");
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Adicionar");
                    break;
                case 2:
                    System.out.println("Alterar");
                    break;
                case 3:
                    System.out.println("Exibir");
                    break;
                case 4:
                    System.out.println("Remover");
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
