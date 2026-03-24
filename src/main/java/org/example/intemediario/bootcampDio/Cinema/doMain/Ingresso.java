package org.example.intemediario.bootcampDio.Cinema.doMain;

public class Ingresso {

    protected int valorBase;
    protected String nomeDoFilme;
    protected String tipoDublagem;
    protected double duracao;

    public Ingresso(int valorBase, String nomeDoFilme, String tipoDublagem, double duracao) {
        this.valorBase = valorBase;
        this.nomeDoFilme = nomeDoFilme;
        this.tipoDublagem = tipoDublagem;
        this.duracao = duracao;
    }

    public Ingresso() {
    }

    public int calcularValorFinal(){
        return valorBase;
    }

    public int obterValorBasePorDia(String diaSemana) {
        switch (diaSemana) {
            case "Segunda-Feira":
            case "Terça-Feira":
            case "Quarta-Feira":
                return 20;

            case "Quinta-Feira":
                return 32;

            case "Sexta-Feira":
            case "Sábado":
            case "Domingo":
                return 42;

            default:
                throw new IllegalArgumentException("Dia inválido");
        }
    }

    public int getValor() {
        return valorBase;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public String getTipoDublagem() {
        return tipoDublagem;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setValorBase(double valorBase) {
    }
}
