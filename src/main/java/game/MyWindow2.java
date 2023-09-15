package game;

import javax.swing.*;
import javax.swing.plaf.TextUI;
import javax.swing.text.JTextComponent;


public class MyWindow2 extends JFrame {

    int x1 =10;
    int y1 = 20;
    char sym1 ='*';


    int x2 =100;
    int y2 = 110;
    char sym2 ='&';

    public MyWindow2() {
        setTitle("Snake Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,200,600,600);


        setLayout(null);
        JTextField tf = new JTextField("*");
       tf.setBounds(x1,y1,20,20);
        add(tf);


        


       /* JButton button2 = new JButton("Snake2");
        button2.setBounds(x2,y2,80,80);
        add(button2);*/

        setVisible(true);
    }


}
