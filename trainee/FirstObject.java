package ru.lesson6.trainee;

import javax.swing.*;

public class FirstObject {

    public static void main(String[] args) {

   MyClass o = new MyClass();
   MyClass f = new MyClass();

   o.set(5,'A');
   f.set(6,'F');
  /* o.number =5;
   o.symbol ='A';

   f.number =7;
   f.symbol = 'F';
*/

   JOptionPane.showMessageDialog(null, o.getInfo(),"First Object",JOptionPane.INFORMATION_MESSAGE);
   JOptionPane.showMessageDialog(null,f.getInfo(),"Second Obj", JOptionPane.INFORMATION_MESSAGE);

}}
