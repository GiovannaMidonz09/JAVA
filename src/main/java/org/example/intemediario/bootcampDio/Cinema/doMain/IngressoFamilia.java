package org.example.intemediario.bootcampDio.Cinema.doMain;

public class IngressoFamilia extends Ingresso{
    protected int valorIngFamilia;
    protected int quantidadePessoas;

    public IngressoFamilia(int valorBase, String nomeDoFilme, String tipoDublagem, double duracao, int valorIngFamilia, int quantidadePessoas) {
        super(valorBase, nomeDoFilme, tipoDublagem, duracao);
        this.valorIngFamilia = valorIngFamilia;
        this.quantidadePessoas = quantidadePessoas;
    }

    public IngressoFamilia() {

    }

    public void setValorIngFamilia(int valorIngFamilia) {
        this.valorIngFamilia = valorIngFamilia;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public int calcularValorFinal(){
        int valorTotal = valorBase * quantidadePessoas;
        if (quantidadePessoas > 3){
            valorTotal *= 0.95;
        }
        return valorTotal;
    }

    @Override
    public int getValor() {
        return valorIngFamilia;
    }

    public void setValor(int valorIngFamilia) {
        this.valorIngFamilia = valorIngFamilia;
    }
}
