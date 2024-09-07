package ru.lesson6.oop;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class TrainingRaining {

    public static void main(String[] args) {


      int n = 123;
      double x = 32.1;
      char symb = 'A';
      boolean state = true;
      String text = "Используемые переменные:\n";
      text = text + "Tseloe chislo:" + n + "\n";
        text = text + "Deistvitelnooe chislo:" + x + "\n";
        text =  text + "Symvol:" + symb + "\n";
        text = text + "Log-e znach-e:" + state;

        JOptionPane.showMessageDialog(null,text);
      Object t = text.getClass();
      System.out.println(t);

    }


}
