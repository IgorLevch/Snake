package ru.lesson6.oop;

import javax.swing.*;

public class DoublePannel {

    public static void main(String[] args) {
        String text;
        String tiitle;

        tiitle = JOptionPane.showInputDialog(null, "Enter text","Title",JOptionPane.WARNING_MESSAGE);
        text = JOptionPane.showInputDialog(null,"What s gonna on hrer", "Mother fucker",
                JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"aaa" + " \n" + text);
        JOptionPane.showMessageDialog(null,text,tiitle,JOptionPane.INFORMATION_MESSAGE);


    }

}
