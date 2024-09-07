package ru.lesson6.ifoperator;

import javax.swing.*;

public class IfDemo2 {

    public static void main(String[] args) {
        String input, txt, title;

        int number;
        ImageIcon img;
        input = JOptionPane.showInputDialog(null, "Enter number", "Checkout",
                JOptionPane.QUESTION_MESSAGE);
        if (input == null) {
            JOptionPane.showMessageDialog(null, "U didn't enter the number", "Mistake",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);

        }


        number = Integer.parseInt(input);
        if (number % 2 == 0) {
            img = new ImageIcon("D:\\Экскременты в сети\\even.png");
            txt = "Number " + number + " even";
            title = " Even number";

        } else {
            img = new ImageIcon("D:\\Экскременты в сети\\odd.png");
            txt = "Number " + number + " odd";
            title = " Odd number";

        }

        JOptionPane.showMessageDialog(null,txt,title,JOptionPane.PLAIN_MESSAGE,img);

    }


}