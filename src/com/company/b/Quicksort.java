package com.company.b;

public class Quicksort {
    public int partition(int a[], int left, int rigth){
        int X=a[left];
        int i=left+1;
        int j=rigth;
        int t=0;
        do {
            while (i<=j&&a[i]<=X){
                i++;
            }
            while (i<=j&&a[j]>X){

                    j--;
            }
            if(i<j){
                 t=a[i];
                a[i]=a[j];
                a[j]=t;
                i++;
                j--;
            }
        }while (i<=j);
        t=a[left];
        a[left]=a[j];
        a[j]=t;
        return j;

    }
    void sort1(int a[],int left,int right){
        if(left<right){
            int pi=partition(a,left,right);
            sort1(a,left,pi-1);
            sort1(a,pi+1,right);
        }
    }
    void print(int a[]){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");

        }
    }

    public static void main(String[] args) {
        int a[]= {2,5,1,9,3,4,7,5};
        int n= a.length;
        Quicksort Q= new Quicksort();
        Q.sort1(a,0,n-1);
        System.out.println("sdfsdf");
        Q.print(a);

    }
}
