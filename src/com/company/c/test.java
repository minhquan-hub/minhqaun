package com.company.c;

public class test {
    public static LinkNode head = null;

    public static void main(String[] args) {
        int a[] = {4,8,9,7,2,4,3,5};
        for (int i = 0; i < a.length; i++) {
            insertion(a[i]);
        }
        deleted(5);
    }
    public static void insertion( int data){
        if(head == null){
            head = new LinkNode(data);
        }else {
            LinkNode p = new LinkNode(data);
            p.next = head;
            head = p;
        }
    }

    public static void deleted(int k){
        LinkNode p = head;
        while (p != null){
            LinkNode t = p.next;
            if(t.data > k){
                p.next = t.next;
            }
            p = p.next;
        }
    }
}
