package org.example.intemediario.bootcampDio.Cinema.doMain;

public class MeiaEntrada extends Ingresso {
    protected int valorMeiaEntrada;

    public MeiaEntrada(int valorBase, String nomeDoFilme, String tipoDublagem, double duracao, int valorMeiaEntrada) {
        super(valorBase, nomeDoFilme, tipoDublagem, duracao);
        this.valorMeiaEntrada = valorMeiaEntrada;
    }

    public void setValorMeiaEntrada(int valorMeiaEntrada) {
        this.valorMeiaEntrada = valorMeiaEntrada;
    }

    public MeiaEntrada() {

    }

    public int calcularValorFinal(){
        return valorBase /2;
    }

    @Override
    public int getValor() {
        return valorMeiaEntrada;
    }

    public void setValor(int valorMeiaEntrada) {
        this.valorMeiaEntrada = valorMeiaEntrada;
    }
}
