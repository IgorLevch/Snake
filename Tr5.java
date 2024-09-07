package ru.lesson6;

import java.util.Arrays;

public class Tr5 {


    public static void main(String[] args) {
        String f = "-2000000000 2000000000";
        String[] numbers = f.split(" ");
        long res = 0;


            for (String s : numbers) {
                res += Long.parseLong(s);
            }
            System.out.println("Summa: " + res);

    }}

