package com.company.e;

import java.util.ArrayList;
import java.util.Iterator;

public class OrderDetail1 {
    private Product1 product;
    private int quatity;



    public OrderDetail1() {
    }


    public OrderDetail1(Product1 product, int quatity){
        setProduct1(product);
        setQuatity(quatity);
    }

    public Product1 getProduct1() {
        return product;
    }

    public void setProduct1(Product1 product) {
        this.product = product;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public double calcTotalPrice(){
        return getQuatity()*getProduct1().getPrice();
    }



    @Override
    public String toString() {
        return "OrderDetail{" +
                "product=" + product +
                ", quatity=" + quatity +
                '}';
    }
}
