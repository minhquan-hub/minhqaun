package com.company.e;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Account {
    private int accountNumber;
    private String name;
    private double balance;
    private final double RATE = 0.035;

    public Account() {
    }

    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public Account(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        if(accountNumber > 0){
            this.accountNumber = accountNumber;
        }else {
            this.accountNumber = 999999;
        }
    }

    public void setName(String name) {
        if(name.equals("")){
            this.name = "xxx";
        } else {
            this.name = name;
        }
    }

    public void setBalance(double balance) {
        if(balance < 50000){
            this.balance = 50000;
        }else {
            this.balance = balance;
        }
    }

    public boolean deposit(double amount){
        if(amount > 0){
            balance = balance+amount;
            return true;
        }else {
            return false;
        }
    }

    public boolean withDraw(double amount, double fee){
        if(amount > 0 && amount+fee <= balance){
            balance = balance - (amount+fee);
            return true;
        }else {
            return false;
        }
    }
    public double addInterrest(){
        return balance = balance + balance*RATE;
    }

    public boolean transfer(Account acc1, double amount){
        // chuyển từ acc1 sang acc2
        if(amount > 0 && acc1.balance > amount) {
            balance = balance - amount;
            acc1.balance = acc1.balance+amount;
            return true;
        }else {
            return false;
        }
    }

    public void print(){
        DecimalFormat dc = new DecimalFormat("#,##0.##");

        System.out.println(String.format("%-10d%-6s%-10f",accountNumber,name,balance));
    }

}
class testAccount{
    public static void main(String[] args) {
        Account acc = new Account(12634, "quan", 50000);
        Account acc1 = new Account(57813, "tin", 52000);
        System.out.println("Truoc khi gửi");
        acc.print();
        acc1.print();
        System.out.println("gui them vao acc va acc1");
        acc.deposit(25000);
        acc1.deposit(10000);
        System.out.println("sau khi gửi thêm");
        acc.print();
        acc1.print();
        System.out.println("rút tiền từ acc va acc1");
        acc.withDraw(30000,1000);
        acc1.withDraw(12000,1000);
        System.out.println("sau khi rút tiền");
        acc.print();
        acc1.print();
        System.out.println("chuyen tu acc qua acc1 la 20000");
        acc.transfer(acc1,20000);
        System.out.println("sau khi gui");
        acc.print();
        acc1.print();
        System.out.println("tien lai");
        System.out.println("ACC: "+acc.addInterrest());
        System.out.println("ACC1: "+acc1.addInterrest());
    }
}
