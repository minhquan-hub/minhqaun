package com.company.c;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
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
}

 class Triangle{
    public Point vertice1;
    public Point vertice2;
    public Point vertice3;

     public Triangle(Point vertice1, Point vertice2, Point vertice3) {
         this.vertice1 = vertice1;
         this.vertice2 = vertice2;
         this.vertice3 = vertice3;
     }

     public Triangle(int x1,int y1, int x2, int y2, int x3, int y3){
         this.vertice1 = new Point(x1,y1);
         this.vertice2 = new Point(x2,y2);
         this.vertice3 = new Point(x3,y3);
     }

     public double getPerimeter(){
         double d1 = Math.sqrt(Math.pow(vertice1.getX()-vertice2.getX(),2)+Math.pow(vertice1.getY()-vertice2.getY(),2));
         double d2 = Math.sqrt(Math.pow(vertice1.getX()-vertice3.getX(),2)+Math.pow(vertice1.getY()-vertice3.getY(),2));
         double d3 = Math.sqrt(Math.pow(vertice2.getX()-vertice3.getX(),2)+Math.pow(vertice2.getY()-vertice3.getY(),2));
         return d1+d2+d3;
     }
 }
 class Entry{
     public static void main(String[] args) {
         Triangle t = new Triangle(2,8,7,6,3,4);
         System.out.println(t.getPerimeter());
     }
 }