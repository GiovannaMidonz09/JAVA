package org.example.intemediario.bootcampDio.Cinema.doMain;

public class Atendente extends Funcionario{

    protected int valorEmCaixa;

    public Atendente(String nome, String email, String senha, boolean statusADM, int valorEmCaixa) {
        super(nome, email, senha, statusADM);
        this.valorEmCaixa = valorEmCaixa;
    }

    public Atendente() {

    }

    public int getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(int valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }
}
