package com.company.e;



import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

public class Order1 extends OrderDetail1{
    private static int orderID = 0;
    private LocalDate orderDate;
    private static int count = 1;
    private static ArrayList<OrderDetail1> list = new ArrayList<>(); // tạo 1 Arraylist ngay tại property và nhớ có Static
    private static double sumCharge;// khi thay đổi giá trị thì biến stactic sẽ lưu vào ô nhớ duy nhất của nó

    public Order1(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        setOrderDate(orderDate);
    }

    public Order1() {
    }


    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void setList(ArrayList<OrderDetail1> list) {
        Order1.list = list;
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public int getCount() {
        return count++;
    }

    public static ArrayList<OrderDetail1> getList() {
        return list;
    }

    public void addLineItem(OrderDetail1 o){
        list.add(o);
    }
    public void printOrderIdanDate(){
        orderID++;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");// cách chuyển đổi kiểu dịnh dạng ngày
        String date = dtf.format(getOrderDate());
        System.out.println("Mã HD: "+getOrderID());
        System.out.println("Ngày lập hóa đơn: "+date);
        System.out.println(String.format("%-8s | %10s | %15s | %10s | %10s | %15s","STT","Mã SP","Mô Tả","Đơn giá","S Lượng","Thành Tiền"));
    }


    public void information(){
        DecimalFormat df = new DecimalFormat("#,##0");// chuyển đổi kiểu tiền tệ
        printOrderIdanDate();
        for (OrderDetail1 p : list) {
            String price = df.format(p.getProduct1().getPrice())+" VNĐ";// kiểu tiền tệ của đơn giá
            String priceEachSP = df.format(p.calcTotalPrice())+" VNĐ"; // kiểu tiền tệ của thành tiền
            System.out.println(String.format("%-8s | %10s | %15s | %10s | %10s | %15s", getCount(), p.getProduct1().getId(), p.getProduct1().getDescription(),price, p.getQuatity(),priceEachSP));
            sumCharge += p.calcTotalPrice(); // biến static giá trị được lưu tại 1 ô nhớ duy nhất

        }
        System.out.println("Total SP :"+ (getCount()-1));
        String priceTotal = df.format(sumCharge)+" VNĐ";
        System.out.println("Total Price: "+priceTotal);
    }



}