package com.company.b;

public class Point {
    private double x;
    private double y;



    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setxy(){
        this.x = x;
        this.y = y;
    }

    public double distance(double a,double b){
        return Math.sqrt((this.x-a)*(this.x-a)+(this.y-b)*(this.y-b));
    }

    public double distance(Point another){
        return distance(another.getX(),another.getY());
    }
}
