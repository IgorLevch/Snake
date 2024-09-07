package ru.lesson6.oop;

import javax.swing.*;

public class TrainingRaining3 {

    public static void main(String[] args) {

        int year, age,birth;
        String text;

        text = JOptionPane.showInputDialog("What is the year now ?");
        year = Integer.parseInt(text);
        text = JOptionPane.showInputDialog("What s your age?");
        age = Integer.parseInt(text);
        birth = year - age;
        JOptionPane.showMessageDialog(null,"you were born in  " + birth + " year.");

       Object g = text.getClass();
        System.out.println(g);


}}
