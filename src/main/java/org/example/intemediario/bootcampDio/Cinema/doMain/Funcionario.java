package org.example.intemediario.bootcampDio.Cinema.doMain;

public class Funcionario {
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean statusADM;

    public Funcionario(String nome, String email, String senha, boolean statusADM) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.statusADM = false;
    }

    //Função para determinar uma conta Administradora
    public boolean ADM(){
        return true;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isStatusADM() {
        return statusADM;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
