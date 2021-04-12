package com.company.e;

import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;
import java.awt.image.BaseMultiResolutionImage;

public class Bai3 {
    private double a;
    private double b;
    private double c;

    public Bai3(double a, double b, double c) {
        this.setA(a);
        this.setB(b);
        this.setC(c);
    }

    public Bai3() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if(a > 0){
            this.a = a;
        }else {
            this.a = 0;
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if(b > 0){
            this.b = b;
        }else {
            this.b = 0;
        }
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        if(c > 0){
            this.c = c;
        }else {
            this.c = 0;
        }
    }

    public double Perimeter(){
        return a+b+c;
    }

    public double Area(){
        double p = Perimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public String Check(){
        if(a<b+c && b<a+c && c<a+b){
            if(a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b){
               return "tam giac vuong";
            }else if(a==b && b==c){
               return  "tam giac deu";
            }else if(a==b || a==c || b==c){
                return "tam giac can";
            }else if(a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b){
                return "tam giac tu";
            }else {
                return "No";
            }
        } else {
            return "No create triangle";
        }
    }


    public void print() {
        System.out.println("a: "+a+" b: "+b+" c: "+c+" Type triangle: "+Check()+" Perimeter: "+Perimeter()+" Area: "+Area());
    }

    public void Print1(){
        System.out.println(String.format("%-8.2f%-8.2f%-8.2f%-20s%-10.2f%-6.2f",a,b,c,Check(),Perimeter(),Area()));

    }
}
class test{
    public static void main(String[] args) {
        Bai3 p = new Bai3(5,8,7);
        Bai3 p1 = new Bai3(6,9,4);
        Bai3 p2 = new Bai3(5,5,5);
        Bai3 p3 = new Bai3(8,8,4);
        System.out.println(String.format("%-8s%-8s%-8s%-20s%-10s%-6s","Canh a","Canh b","Canh c","Type triangle","Perimeter","Area"));
        p.Print1();
        p1.Print1();
        p2.Print1();
        p3.Print1();

    }
}