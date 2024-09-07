package ru.lesson6.oop;

import javax.swing.*;
import java.util.Scanner;

public class TrainingRaining5 {

    public static void main(String[] args) {
        int age;
        double height,weight;
        String name;


        Scanner input = new Scanner(System.in);
        System.out.print("your age");
        age = input.nextInt();
        System.out.println("your height");
        height = input.nextDouble();
        System.out.println("your mass");
        weight = input.nextDouble();

        System.out.println("you were born in " +(2023-age)+" !");
        double bmi = weight/height/height;
        System.out.println("your bmi =  "+bmi);
}}
