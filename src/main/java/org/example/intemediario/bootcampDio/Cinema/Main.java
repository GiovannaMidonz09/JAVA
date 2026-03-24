package org.example.intemediario.bootcampDio.Cinema;

import org.example.intemediario.bootcampDio.Cinema.doMain.Ingresso;
import org.example.intemediario.bootcampDio.Cinema.doMain.IngressoFamilia;
import org.example.intemediario.bootcampDio.Cinema.doMain.MeiaEntrada;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso();
        Ingresso ingFamilia = new IngressoFamilia();
        Ingresso ingMeia = new MeiaEntrada();

        int valorBase = ingresso.obterValorBasePorDia("Sexta-Feira");
        ingresso.setValorBase(valorBase);

        int ingressoFamilia = ingFamilia.calcularValorFinal();
        ingMeia.setValorBase(ingressoFamilia);

        int ingressoMeia = ingMeia.calcularValorFinal();
        ingFamilia.setValorBase(ingressoMeia);
        System.out.println("VALOR DO INGRESSO DO DIA: " + valorBase);
        System.out.println("VALOR DO INGRESSO MEIA: " + ingressoMeia);
        System.out.println("VALOR DO INGRESSO DA FAMILIA: " + ingressoFamilia);

    }
}
