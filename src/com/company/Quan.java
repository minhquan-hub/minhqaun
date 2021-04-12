package com.company;

import java.util.Scanner;

public class Quan {
    public static void main(String[] args) {

        Scanner sc;
        boolean loop = true;
        do {
            try {
                sc = new Scanner(System.in);
                System.out.print("CD code " + " : ");

                loop = false;
            } catch (Exception e) {
                System.out.println("Enter again");

            }
        } while (loop);
    }

}
