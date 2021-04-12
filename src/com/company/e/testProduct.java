package com.company.e;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class testProduct {
    public static void main(String[] args) {
        Product1 p1 = new Product1(1,"gao",15000);
        Product1 p2 = new Product1(2,"milk",17000);
        Product1 p3 = new Product1(3,"gao",18000);

        OrderDetail1 o1 = new OrderDetail1(p1,20);
        OrderDetail1 o2 = new OrderDetail1(p2,30);
        OrderDetail1 o3 = new OrderDetail1(p3,50);

        Order1 o = new Order1();
        o.addLineItem(o1);
        o.addLineItem(o2);
        o.addLineItem(o3);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse("07/04/2021",dtf);
        o.setOrderDate(date);

        o.information();

    }
}
