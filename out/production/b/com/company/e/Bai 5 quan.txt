package com.company.e;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class Bai5 {
    private static int ma = 1000;
    private String name;
    private int price;
    private LocalDate dateSX;
    private LocalDate dateHH;

    public Bai5(String name, int price, LocalDate dateSX, LocalDate dateHH) {
        this.setName(name);
        this.setPrice(price);
        this.setDateSX(dateSX);
        this.setDateHH(dateHH);
    }

    public Bai5() {
    }

    public int getMa() {
        return ma++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals("")){
            this.name = "xxx";
        }else {
            this.name = name;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price >= 0){
            this.price = price;
        }else {
            this.price = 0;
        }
    }

    public LocalDate getDateSX() {

        return dateSX;
    }

    public void setDateSX(LocalDate dateSX) {
        if(!dateSX.isBefore(LocalDate.now())){
            this.dateSX = LocalDate.now();
        }else {
            this.dateSX = dateSX;
        }
    }

    public LocalDate getDateHH() {
        return dateHH;
    }

    public void setDateHH(LocalDate dateHH) {
        if(!dateHH.isBefore(LocalDate.now())){
            this.dateHH= LocalDate.now();
        }else {
            this.dateHH = dateHH;
        }
    }
    public String Check(){
        LocalDate check = LocalDate.now();
        if(check.isAfter(dateHH)){
            return "het han su dung";
        }
        return null;
    }

    public void print(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String mfd = dtf.format(getDateSX());
        String exd = dtf.format(getDateHH());
        System.out.println(String.format("%-6d %-30s %25s %20s %20s %16s", getMa(), name, price, mfd, exd, Check()));

    }

}
class testDate{
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.parse("11/02/2021", dtf);
        LocalDate date2 = LocalDate.parse("21/02/2021",dtf);
        Bai5 milk = new Bai5("milk",31000,date1,date2);
        Bai5 egg = new Bai5("egg",20000,date1,date2);
        Bai5 meat = new Bai5("meat",150000,date1,date2);
        System.out.printf("%-6s %-30s %25s %20s %20s %16s%n", "Code", "Product Name", "Price", "Manufacture Date", "Expiration Date", "Notes");
        System.out.println("===========================================================================================================================");
        milk.print();
        meat.print();
        egg.print();








    }
}

