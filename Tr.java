package ru.lesson6;

import java.util.Random;

public class Tr {


    public static void main(String[] args) {
   int a = -5;


            System.out.println(a+"  "+Integer.toBinaryString(a));

        for (int i = 0; i < 10; i++) {
            a=a>>>1;
        }
        System.out.println(a+"  "+Integer.toBinaryString(a));

        String str = "a really, really long string";
        for (int i = 0, n = str.length(); i < n; i++) {
            char c = str.charAt(i);
        }


        char[] chars = str.toCharArray();
        for (int i = 0, n = chars.length; i < n; i++) {
            char c = chars[i];
            char b = chars[3];
            char bb = chars[4];
            char bbb = chars[5];
            System.out.println( b);
            System.out.println( bb);
            System.out.println( bbb);
        }

    }
}
