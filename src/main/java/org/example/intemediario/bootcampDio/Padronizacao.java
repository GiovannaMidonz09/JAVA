package org.example.intemediario.bootcampDio;

import java.util.Scanner;

public class Padronizacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a linha de entrada contendo o nome do projeto
        String nomeProjeto = scanner.nextLine();

        // TODO: Converta o nome do projeto para letras maiúsculas e calcule seu comprimento
        String nomeConvertidoMaisculo = nomeProjeto.toUpperCase();
        int comprimento = nomeProjeto.length();
        // Dica: Use métodos da classe String para manipular o texto.
        // Imprima o nome em maiúsculas seguido de um espaço e do número de caracteres.
        System.out.println(nomeConvertidoMaisculo +" " + comprimento);
        scanner.close();
    }
}
