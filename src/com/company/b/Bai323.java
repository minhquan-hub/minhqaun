package com.company.b;
// Bai323a
import java.util.Scanner;

public class Bai323 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a[][] = new float[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("a["+i+"]["+j+"]= ");
                a[i][j] = sc.nextFloat();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        float b[] = new float[a.length];
        for (int j = 0; j < a.length; j++) {
            float tich = 1;
            for (int i = 0; i < a.length; i++) {
                if(a[i][j]>=0){
                    tich *= a[i][j];
                    b[j]=tich;
                }
            }
        }
        for (int j = 0; j < a.length; j++) {
            System.out.println("cot "+j+" co tich bang: "+b[j]);
        }
    }
}
