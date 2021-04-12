package com.company.b;

import java.util.ArrayList;

public class Account1 {
    public static void main(String[] args) {
        Account a = new Account(1001,"quan",50000);
        a.display();
        a.deposit(5000);
        a.display();
        a.withdraw(2000);
        a.display();
        a.withdraw(53000);
        a.display();
        a.withdraw(2000);
        a.display();
    }
}
