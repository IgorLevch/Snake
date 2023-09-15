package game;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class MyWindow extends JFrame {

    int x1 = 10;
    int y1 = 20;
    char sym1 = '*';


    int x2 = 100;
    int y2 = 110;
    char sym2 = '&';

    public MyWindow() {
        setTitle("Snake Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 200, 600, 600);


        setLayout(null);
        JButton button = new JButton("Snake");
        button.setBounds(x1, y1, 80, 80);
        add(button);


        JButton button2 = new JButton("Snake2");
        button2.setBounds(x2, y2, 80, 80);
        add(button2);

        setVisible(true);

        List<Object> but = new ArrayList<>() {
        };

        but.add(button);
        but.add(button2);

        for (Object i : but
        ) {
            System.out.println("Here comes info about objects: "+"\n"+i);
        }



    }










}
