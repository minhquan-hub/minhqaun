package com.company.d;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
    static Stack<Integer> st = new Stack<>();

    public static int  addStack(int add){
        if(add == 0){
            return 1;
        }else {
            int n = add / 2;
            int x = add % 2;
            st.push(x);
            return addStack(n);
        }
    }

    public static void main(String[] args) {
        addStack(11);
        Iterator<Integer> k = st.iterator();
        while (k.hasNext()){
            System.out.println(k.next());
        }
    }

}
