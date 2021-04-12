package com.company.e;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Food {
    private static int size = 0;
    private int code;
    private String name;
    private double price;
    private LocalDate manufactureDate;
    private LocalDate expirationDate;

    public Food() {
        setCode();
        setName(null);
        setPrice(-1);
        setManufactureDate(LocalDate.now());
        setExpirationDate(LocalDate.now());
    }

    public Food(String name, int price, LocalDate manufactureDate, LocalDate expirationDate) {
        setCode();
        setName(name);
        setPrice(price);
        setManufactureDate(manufactureDate);
        setExpirationDate(expirationDate);
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    private void setCode() {
        size++;
        this.code = size;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "xxx";
        }
    }

    public void setPrice(int price) {
        this.price = Math.max(price, 0);
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        if (!manufactureDate.isBefore(LocalDate.now())) {
            this.manufactureDate = LocalDate.now();
        } else {
            this.manufactureDate = manufactureDate;
        }
    }

    public void setExpirationDate(LocalDate expirationDate) {
        if (!expirationDate.isAfter(this.manufactureDate)) {
            this.expirationDate = this.manufactureDate;
        } else {
            this.expirationDate = expirationDate;
        }
    }

    public boolean isExpiry() {
        return LocalDate.now().isAfter(getExpirationDate());
    }

    @Override
    public String toString() {
        String remark;
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String price = df.format(getPrice()) + " VND";

        if (isExpiry()) {
            remark = "Expired";
        } else {
            remark = "";
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String mfd = dtf.format(getManufactureDate());
        String exd = dtf.format(getExpirationDate());
//		return String.format(" %03d   %-30s %,25.2f %-20s %-20s %-16s", getCode(), getName(), getPrice(), mfd, exd, remark);
        return String.format(" %03d   %-30s %25s %20s %20s %16s", getCode(), getName(), price, mfd, exd, remark);
    }
}

class testfood{
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date1 = "31/01/2022";
        String date2 = "31/12/2019";

        Food apple = new Food("US Apple", 93000, LocalDate.parse(date1, dtf), LocalDate.parse(date2, dtf));
        Food vegetable = new Food();
        Food pineapple = new Food("Pine Apple", 58000, LocalDate.parse("23/01/2020", dtf), LocalDate.parse("31/12/2021", dtf));
        Food milk = new Food("Ong Tho Condensed Milk", 15000, LocalDate.parse("15/01/2019", dtf), LocalDate.parse("31/12/2020", dtf));
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-6s %-30s %25s %20s %20s %16s%n", "Code", "Product Name", "Price", "Manufacture Date", "Expiration Date", "Notes");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        System.out.println(apple.toString());
        System.out.println(vegetable.toString());
        System.out.println(pineapple.toString());
        System.out.println(milk.toString());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

    }
}