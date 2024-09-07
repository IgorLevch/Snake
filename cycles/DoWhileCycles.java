package ru.lesson6.cycles;


import javax.swing.*;

public class DoWhileCycles {

static String coder(int n){

    String s ="";
    do{
        s=(n%2)+s;
        n/=2;

    }while(n!=0);

    return s;
}

    public static void main(String[] args) {

    String k = JOptionPane.showInputDialog(null,"Game","enter figure",JOptionPane.QUESTION_MESSAGE);
    if (k==null){
        System.exit(0);
    }
            int num = Integer.parseInt(k);
    String l = coder(num);
    String txt = "U entered: "+k;
    txt+="\nReceived: "+l;
    JOptionPane.showMessageDialog(null,txt,"The Game is over",JOptionPane.INFORMATION_MESSAGE);

    }
 

}

