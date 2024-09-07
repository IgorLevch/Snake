package ru.lesson6.productIssue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
    ProductRepository pro=null;
   // OrderService ord = new OrderService(3);

       ProductRepository.produc = new ArrayList<>(Arrays.asList(
        new Product(1,"toy","red"),
        new Product(2,"tv","black"),
        new Product(3,"car","white"),
        new Product(4,"table game","yellow"),
        new Product(5,"coffee","brown")
       ));





        Scanner sc = new Scanner(System.in);
        System.out.println("enter id");
        int y = sc.nextInt();
        Product u=pro.findById(y);

        System.out.println(u);

    }
}
