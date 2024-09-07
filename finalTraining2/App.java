package ru.lesson6.finalTraining2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Processing pross = new Processing();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter id");
        int u = sc.nextInt();
        String c = pross.setTitlebyId(u);
        Boolean pp = pross.setitlebyId(u);
        Character ppp = pross.setCharbyId(u);

        System.out.println(c);
        System.out.println(pp);
        System.out.println(ppp);
    }

}
