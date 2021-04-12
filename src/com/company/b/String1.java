package com.company.b;
/* String char[] toCharArray để chuyển đổi mảng thành mảng kí tự..
Nó trả về có độ dài chuỗi bằng mảng kí tự */
public class String1 {
    public static void main(String[] args) {
        String s = new String("hello");
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
        /*
        h
        e
        l
        l
        o */
    }
}
