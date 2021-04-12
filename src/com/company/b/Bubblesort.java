package com.company.b;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[7];
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]= ");
            a[i] = sc.nextInt();
        }
        Bubblesort1(a);
        Binarysearch(a);
    }

    public static void Bubblesort1 (int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    int tmp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = tmp;
                }
            }

        }
        System.out.println("mang sau sap xep: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void Binarysearch(int a[]) {
        Scanner sc = new Scanner(System.in);
        int left = 0;
        int right = a.length - 1;
        System.out.println("Nhap so can tim: ");
        int x = sc.nextInt();
        int dem = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == x) {
                System.out.println("a[" + mid + "]= " + a[mid]);
                dem++;
                break;
            } else if (a[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
     if(dem==0){
         System.out.println("khong tim thay");
     }
    }



}



