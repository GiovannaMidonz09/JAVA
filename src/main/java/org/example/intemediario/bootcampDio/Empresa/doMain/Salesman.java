package org.example.intemediario.bootcampDio.Empresa.doMain;

public non-sealed class Salesman extends Employee {

    private double percentPeSold;

    public Salesman(String name, String code, String address, int age, double salary, double percentPeSold) {
        super(name, code, address, age, salary);
        this.percentPeSold = percentPeSold;
    }

    public Salesman() {
    }

    @Override
    public String getCode(){
        return "SL" + this.code;
    }
    public double getPercentPeSold() {
        return percentPeSold;
    }

    public void setPercentPeSold(double percentPeSold) {
        this.percentPeSold = percentPeSold;
    }
}
