package com.company.d;

import java.util.Random;

public class LinkNode1 {
    public static LinkNode head = null;

    public static void main(String[] args) {
        int a[] = {5,7,12,8,7,4,9,7,14};
        for (int i = 0; i < a.length ; i++) {
            insertLast(a[i]);
        }
//        printValue(head);
//        System.out.println("Tổng các số chẵn là:"+evenSum(head));
//        headSorted(head);
        removeDuplicate(head);
        printValue(head);
    }

    public static void insertLast(int data){
        if(head == null){
            head = new LinkNode(data);
        }else {
            LinkNode p = head;
            while (p.next != null){
                p = p.next;
            }
            p.next = new LinkNode(data);
        }
    }

    public static void printValue(LinkNode head){
        LinkNode p = head;
        while (p != null){
            System.out.print(p.data+" ");
            p = p.next;
        }
    }

    public static int evenSum(LinkNode head){
        int sum = 0;
        if (head == null){
            System.out.println("Chuoi rong");
        }else {
            LinkNode p = head;
            while (p != null){
                if(p.data % 2 == 0){
                    sum += p.data;
                }
                p = p.next;
            }
        }
        return sum;
    }
    public static void headSorted(LinkNode head){
        if (head == null) {
            System.out.println("Chuoi rong");
        } else {
            LinkNode p = head;
            while (p != null){
                LinkNode t = p;
                while (t != null){
                    if(t.data < p.data){
                        int tmp = t.data;
                        t.data = p.data;
                        p.data = tmp;
                    }
                    t = t.next;
                }
                p = p.next;
            }
            p = head;
            while (p != null){
                System.out.print(p.data+" ");
                p = p.next;
            }

        }

    }

    public static void removeDuplicate(LinkNode head){
        if(head == null){
            System.out.println("Chuoi rong");
        }else {
            LinkNode p = head;
            while (p != null){
                LinkNode t = p.next;
                while (t != null){
                    if(t.next != null) {
                        if (t.next.data == p.data) {
                            t.next = t.next.next;
                        }
                    }
                        t = t.next;
                }
                p = p.next;
            }
        }
    }
}
