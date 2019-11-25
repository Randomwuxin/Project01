package com.zzy.java;

import java.util.ArrayList;

public class HelloWorld {
    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println("hello!");
        //变形：soutp / soutm / soutv / xxx.out
        System.out.println("args = [" + args + "]");
        System.out.println("HelloWorld.main");

        int a = 10;
        System.out.println("a = " + a);

        String[] arr = new String[]{"Li","Jerry","Wang"};
        //模板三：fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形:itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(1234);
        list.add(12345);
        for (Object o : list) {
            System.out.println(o);
        }


    }


}
