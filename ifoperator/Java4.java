package ru.lesson6.ifoperator;

import javax.swing.*;

public class Java4 {


    public static void main(String[] args) {


        String txt, title, data;
        ImageIcon img;

        int number;

        data = JOptionPane.showInputDialog(null, "Enter number", "Checkout",JOptionPane.QUESTION_MESSAGE);
        if (data == null) {
            JOptionPane.showMessageDialog(null, "Enter number", "Result", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        number = Integer.parseInt(data);


        if (number%2==0){
            txt = "the number " + number +"is even";
            title = "Even";
            img = new ImageIcon("D:\\Экскременты в сети\\even.png");
        } else {
            txt = "the number " + number +"is odd";
            title = "Odd";
            img = new ImageIcon("D:\\Экскременты в сети\\odd.png");
        }

        JOptionPane.showMessageDialog(null,txt,title,JOptionPane.PLAIN_MESSAGE,img);
    }
}