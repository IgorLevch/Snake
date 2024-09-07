package ru.lesson6.cycles;

import javax.swing.*;

public class WhileCycles<u> {

    static int decoder (String code) {

        int l = code.length();

        int a, q = 1, s = 0, k = 1;

        while (k <= l) {
            if (code.charAt(l - k) == '1') {
                a = 1;
            } else {
                a = 0;
            }


            s += a * q;
            q *= 2;
            k++;

        }
        return s;
    }

    public static void main(String[] args) {


        String title = "enter";
        String u = JOptionPane.showInputDialog(null, "enter number", title, JOptionPane.QUESTION_MESSAGE);
        if (u==null) {
            System.exit(0);
        }
        int num = decoder(u);
        String txt = "U enterred: " + u;
        txt+="\nThe outcome is: " + num;

        JOptionPane.showMessageDialog(null,txt,title,JOptionPane.INFORMATION_MESSAGE);
    }
}

