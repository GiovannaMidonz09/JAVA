package org.example.intemediario.bootcampDio.Empresa.doMain;

public non-sealed class Manager extends Employee {

    private String login;
    private String password;
    private double comission;

    public Manager(String name, String code, String address, int age, double salary, double comission, String password, String login) {
        super(name, code, address, age, salary);
        this.comission = comission;
        this.password = password;
        this.login = login;
    }

    public Manager() {

    }

    @Override
    public String getCode(){
        return "SL" + this.code;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }
}
