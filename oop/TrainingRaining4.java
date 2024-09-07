package ru.lesson6.oop;

import javax.swing.*;

public class TrainingRaining4 {

    public static void main(String[] args) {
        double a,b,c;
        String text;

        text = JOptionPane.showInputDialog("How tall are you?");
        a = Double.parseDouble(text);
        text = JOptionPane.showInputDialog("what 's your weight");
        b = Double.parseDouble(text);
        c=b/a/a;
        c = Math.round(c);
        JOptionPane.showMessageDialog(null,"your coefficient is  "+c+" units");

    }
}
