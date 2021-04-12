package com.company.e;

public class Bai2 {
    private int id;
    private String name;
    private double diemLT;
    private double diemTH;

    public Bai2(int id, String name, double diemLT, double diemTH) {
        this.setId(id);
        this.setName(name);
        this.setDiemLT(diemLT);
        this.setDiemTH(diemTH);
    }

    public Bai2() {
    }

    public void  setId(int  id){
        if(id > 0){
            this.id = id;
        }else {
             this.id = 0;
        }
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public void setName(String name){
        if(name.equals("")){
            this.name = "vui long nhap ten";
        } else {
             this.name = name;
        }
    }

    public void setDiemLT(double diemLT){
        if(diemLT < 0 || diemLT > 10){
            this.diemLT = 0;
        }else {
            this.diemLT = diemLT;
        }
    }

    public void setDiemTH(double diemTH){
        if(diemTH < 0 || diemTH > 10){
            this.diemTH = 0;
        }else {
            this.diemTH = diemTH;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public double average(){
        return (diemLT+diemTH)/2;
    }

    @Override
    public String toString() {
        return "Id:"+id+" Name:"+name+" DiemLT:"+diemLT+" DiemTH:"+diemTH+" DiemTB:"+average();
    }

    public  void print(){
        System.out.println(String.format("%-5d%-20s%-8s%-8s",getId(),getName(),getDiemLT(),getDiemTH()));
    }
}
class Entry{
    public static void main(String[] args) {
        Bai2 b = new Bai2(-1,"",11,9);
        Bai2 b1 = new Bai2();
        System.out.println(b.toString());
        b1.setId(1);
        b1.setName("tin");
        b1.setDiemLT(6);
        b1.setDiemTH(7);
        System.out.println(b1.toString());
        System.out.println(String.format("%-5s%-20s%-8s%-8s","ma","hoten","diemlt","diemth"));
        b.print();
        b1.print();


    }
}
