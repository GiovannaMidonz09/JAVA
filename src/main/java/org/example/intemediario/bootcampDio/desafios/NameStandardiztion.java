package org.example.intemediario.bootcampDio.desafios;

import java.util.Scanner;

public class NameStandardiztion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeProjeto = scanner.nextLine();

        // TODO: Remova espaços extras do início e fim da string
        String nomeProjetoSemEspacos = nomeProjeto.trim();

        // Dica: Use um método da classe String para eliminar espaços em branco antes de validar

        // Se o nome está vazio após o tratamento, imprima "INVALIDO"

            if(nomeProjetoSemEspacos != null && !nomeProjetoSemEspacos.isEmpty() ){
                System.out.println(nomeProjetoSemEspacos.toUpperCase());
            }else{
                System.out.println("INVALIDO");
            }


        // Caso contrário, imprima o nome em letras maiúsculas
    }
}
