//package com.company.b;
//
//import java.util.Scanner;
//
//public class Bai323b {
//    private int n;
//    private int m;
//
//    public int Nhap(){
//        Scanner sc = new Scanner(System.in);
//        int a[][] = new int[n][m];
//        do {
//            System.out.println("Nhap so dong: ");
//            n = sc.nextInt();
//            if(n<0){
//                System.out.println("Nhap lai so dong: ");
//            }else {
//                break;
//            }
//        }while (n<0);
//        do {
//            System.out.println("Nhap so hang: ");
//            m = sc.nextInt();
//            if(m<0){
//                System.out.println("Nhap lai so cot: ");
//            }else{
//                break;
//            }
//        }while (m<0);
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.println("a["+i+"]["+j+"]= ");
//                a[i][j] = sc.nextInt();
//            }
//        }
//        return a[n][m];
//    }
//    public void Xuat(){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.println(a[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//    public void Tinh(){
//        Scanner sc = new Scanner(System.in);
//        int tich = 0;
//        int x;
//        do {
//            System.out.println("Nhap so dong can tinh tich: ");
//             x = sc.nextInt();
//            if(x<0 || x>n){
//                System.out.println("vui long nhap lai");
//            }else{
//                break;
//            }
//        } while (x<0 || x>n);
//        for (int j = 0; j < a.length; j++) {
//            tich *= a[x][j];
//        }
//        System.out.println(tich);
//    }
//}
