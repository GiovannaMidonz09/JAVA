package org.example.intemediario.bootcampDio.Cinema.doMain;

public class Vendedor extends Funcionario{
    protected int quantidadeDeVendas;

    public Vendedor(String nome, String email, String senha, boolean statusADM, int quantidadeDeVendas) {
        super(nome, email, senha, statusADM);
        this.quantidadeDeVendas = quantidadeDeVendas;
    }

    public Vendedor() {

    }

    public int getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(int quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }
}
