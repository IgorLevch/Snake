package ru.lesson6.productIssue2;

import ru.lesson6.productIssue.Product;

import java.util.HashMap;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

            ProductRepository productRepository = null;
       HashMap pr = new HashMap<>();
        pr.put(1,"oop1");
        pr.put(2,"oop4");
        pr.put(3,"oop5");
        pr.put(4,"oop45");


        Scanner sc = new Scanner(System.in);
        System.out.println("enter id");
        int y = sc.nextInt();
              String ouo = String.valueOf(productRepository.findById(y));
        System.out.println(ouo);


    }
}
