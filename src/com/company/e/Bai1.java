package com.company.e;

public class Bai1 {
    public int x;
    public int y;

    public Bai1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "E("+x+","+y+")";
    }
}
//class Entry{
//    public static void main(String[] args) {
//        Bai1 b = new Bai1(7,9);
//        System.out.println(b.toString());
//
//    }
//}
