package ru.lesson6.neww2Training;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Product prod = new Product();

        prod.u.put(1,"milk");
        prod.u.put(2,"bread");
        prod.u.put(3,"water");

        Scanner sc= new Scanner(System.in);
        System.out.println("enter");
        int c= sc.nextInt();
        String v = prod.u.get(c);
        System.out.println(v);
    }

}
