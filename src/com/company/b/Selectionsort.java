package com.company.b;

public class Selectionsort {
    public static void main(String[] args) {
        int a[] = {1,5,9,2,4,3,7};
        for (int i = 0; i < a.length-1; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if(a[min]>a[j]){
                    min = j;
                }
            }
            if(min != i){
                int t=a[i];
                a[i]=a[min];
                a[min]=t;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
    }
}
