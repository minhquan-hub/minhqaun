package com.company.e;


import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Bai8 {
    private int codeCD;
    private String nameCD;
    private int amountCD;
    private double priceCD;


    public Bai8() {
    }

    public Bai8(int codeCD, String nameCD, int amountCD, double priceCD) {
        this.setCodeCD(codeCD);
        this.setNameCD(nameCD);
        this.setAmountCD(amountCD);
        this.setPriceCD(priceCD);
    }

    public int getCodeCD() {
        return codeCD;
    }

    public void setCodeCD(int codeCD) {
        if(codeCD > 0){
            this.codeCD = codeCD;
        } else {
            this.codeCD = 999999;
        }
    }

    public String getNameCD() {
        return nameCD;
    }

    public void setNameCD(String nameCD) {
        if(nameCD.equals("")){
            this.nameCD = "no indentify";
        }else {
            this.nameCD = nameCD;
        }
    }

    public int getAmountCD() {
        return amountCD;
    }

    public void setAmountCD(int amountCD) {
        if (amountCD > 0){
            this.amountCD = amountCD;
        } else {
            this.amountCD = 0;
        }
    }

    public double getPriceCD() {
        return priceCD;
    }

    public void setPriceCD(double priceCD) {
        if(priceCD > 0){
            this.priceCD = priceCD;
        }else {
            this.priceCD = 0;
        }
    }

    public void print(){
        System.out.println(String.format("%-6s%-15s%-7s%-15s",getCodeCD(),getNameCD(),getAmountCD(),getPriceCD()));
    }

}

class CDlist extends Bai8 {

    public static ArrayList<Bai8> list = new ArrayList<>();

    public void initialization() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount CD you want: ");
        int amount = sc.nextInt();
        for (int i = 1; i <= 1; i++) {
            boolean loop = true;
            do {
                try {
                    System.out.print("CD code " + i + " : ");
                    int CDcode = sc.nextInt();
                    System.out.print("CD name " + i + " : ");
                    String name = sc.next();
                    System.out.print("CD amount " + i + " : ");
                    int a = sc.nextInt();
                    System.out.print("CD price " + i + " : ");
                    double price = sc.nextDouble();
                    Bai8 CD = new Bai8(CDcode, name, a, price);
                    list.add(CD);
                    loop = false;
                } catch (Exception e) {
                    System.out.println("Enter again");
                    sc.close();
                }
            } while (loop);
        }
    }

    public void add1CD() {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        do {
            try {
                int CDcode = check();
                System.out.print("CD name :");
                String name = sc.next();
                System.out.print("CD amount :");
                int a = sc.nextInt();
                System.out.print("CD price :");
                double price = sc.nextDouble();
                Bai8 CD = new Bai8(CDcode, name, a, price);
                list.add(CD);
                loop = false;
            } catch (Exception e) {
                System.out.println("Enter again");
            }
        } while (loop);
    }

    private int check() {
        Scanner sc = new Scanner(System.in);
        System.out.print("CD code :");
        int code = sc.nextInt();
        for(Bai8 p : list) {
            if (p.getCodeCD() == code) {
                System.out.println("Enter again code");
                return check();
            }
        }

        return code;
    }

    public int count(){
        int count = 0;
        for (Bai8 CD : list){
            count++;
        }
        return count;

    }
    public double sumPrice(){
        int sum = 0;
        for (Bai8 CD : list){
            sum += CD.getPriceCD();
        }
        return sum;
    }

    public void information(){
        System.out.println("****************************");
        Iterator<Bai8> infor = list.iterator();
        while (infor.hasNext()){
            infor.next().print();
        }
        System.out.println("****************************");
    }

    public void sortPrice(){
        System.out.println("price after sort");
        Collections.sort(list, new Comparator<Bai8>() {
            @Override
            public int compare(Bai8 o1, Bai8 o2) {
                return o1.getPriceCD() > o2.getPriceCD() ? -1 : 1;
            }
        });
        information();
    }

    public void sortName(){
        System.out.println("Name after sort");
        Collections.sort(list, new Comparator<Bai8>() {
            @Override
            public int compare(Bai8 CD1, Bai8 CD2) {
                return (CD2.getNameCD().compareTo(CD2.getNameCD()));
            }
        });
        information();
    }
}



class testCD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai8 p[] = new Bai8[3];// phần in thử thông tin
        p[0] = new Bai8(1,"toan",6,12000);
        p[1] = new Bai8(2,"tuan",7,14000);
        p[2] = new Bai8(3,"tin",8,15000);
        for (int i = 0; i < p.length; i++) {
            p[i].print();
        }
        boolean loop = true;
        System.out.println("WECOME TO CD STORE");
        System.out.println("====================================");
        do {//tạo vòng lặp loop
            System.out.println("1.Enter into list CD.\n" +
                    "2.Add one CD into list.\n" +
                    "3.Count CD in list.\n" +
                    "4.Total price all CD in list.\n" +
                    "5.Print information all CD in list.\n" +
                    "6.Sort follow price CD decrease.\n" +
                    "7.Sort follow name CD ascending.\n"+
                    "8.Exit.");
            System.out.println("Enter option you want: ");
            int choose = sc.nextInt();
            CDlist CD = new CDlist();// tạo object để gọi các methods
            switch (choose){
                case 1:CD.initialization();break;
                case 2:CD.add1CD();break;
                case 3:System.out.println("##Amount have into CD list: "+CD.count());break;
                case 4:System.out.println("##Total price: "+CD.sumPrice());break;
                case 5: {
                    System.out.println(String.format("%-6s%-15s%-7s%-15s", "Code", "Name", "Amount", "Price"));
                    CD.information();break;
                }
                case 6:CD.sortPrice();break;
                case 7:CD.sortName();break;
                case 8: loop = false;

            }
        }while (loop);

    }

}
