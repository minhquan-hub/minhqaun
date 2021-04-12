package com.company.e;

import java.util.Scanner;

public class Vehicle {
    private String name;
    private String moto;
    private int price;
    private int capacity;

    public Vehicle(String name, String moto, int price, int capacity) {
        this.name = name;
        this.moto = moto;
        this.setPrice(price);
        this.setCapacity(capacity);
    }

    public int setPrice(int price){
        if(price >= 0){
            return this.price = price;
        }else {
           return this.price = 0;
        }
    }

    public int setCapacity(int capacity){
        if(capacity >= 0){
            return this.capacity = capacity;
        }else {
            return this.capacity = 0;
        }
    }

    public double tax(){
        if(capacity < 100){
            return price*0.01;
        }else if(capacity > 100 && capacity < 200){
            return price*0.03;
        }else {
            return price*0.05;
        }
    }

    public void print(){
        System.out.println(String.format("%-15s%-15s%-10d%-20d%-15f",name,moto,price,capacity,tax()));
    }
}

class testMoto{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong xe: ");
        int soluong = sc.nextInt();
        String name[] = new String[soluong];
        String motop[] = new String[soluong];
        int capacity[] = new int[soluong];
        int price[] = new int[soluong];
        Vehicle v[] = new Vehicle[soluong];
        for (int i = 0; i < soluong; i++) {
            System.out.print("Nhap ten xe "+i+" : ");
            name[i] = sc.next();
            System.out.print("Nhap loai xe "+i+" : ");
            motop[i] = sc.next();
            System.out.print("Nhap dung tich "+i+" : ");
            capacity[i] = sc.nextInt();
            System.out.print("Nhap gia xe "+i+" : ");
            price[i] = sc.nextInt();
            v[i] = new Vehicle(name[i],motop[i],capacity[i],price[i]);
        }
        System.out.println(String.format("%-15s%-15s%-10s%-20s%-15s","Name","Type","Capacity","Price","Tax"));
        for (int i = 0; i < soluong; i++) {
            v[i].print();
        }
    }

    public void inPut(int n){

    }
}
