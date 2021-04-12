package com.company.e;

public class HìnhTron extends ToaDo {
    private ToaDo tam;
    private double bankinh;

    public HìnhTron(ToaDo tam, double bankinh) {
        this.tam = tam;
        this.bankinh = bankinh;
    }

    public HìnhTron() {
    }

    public ToaDo getTam() {
        return tam;
    }

    public void setTam(ToaDo tam) {
        this.tam = tam;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }
    public double tinhChuVi(){
        return 3.14*bankinh;
    }

    public double tinhDienTich(){
        return 3.14*bankinh*bankinh;
    }

    @Override
    public String toString() {
        return String.format("Hình tròn có tâm %s(%f,%f) với bán kính"+bankinh+" có diện tích và chu vi lần lượt là %f và %f.",getTam().getTen(),getTam().getX(),getTam().getY(),tinhDienTich(),tinhChuVi());
    }
}
