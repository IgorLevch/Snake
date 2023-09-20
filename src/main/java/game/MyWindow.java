package game;

import javax.swing.*;
import java.awt.*;
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



        List<Object> but = new ArrayList<>() {
        };

        but.add(button);
        but.add(button2);

        for (Object i : but
        ) {
            System.out.println("Here comes info about objects: "+"\n"+i);
        }

        // horizontal line:

        JButton tf = new JButton("*");
        tf.setBounds(450,400,50,50);
       // add(tf);
        JButton tf1 = new JButton("&");
        tf1.setBounds(400,400,50,50);
      // add(tf1);
        JButton tf2 = new JButton("%");
        tf2.setBounds(350,400,50,50);
       // add(tf2);

        List<Object> tfl = new ArrayList<>(){};

        tfl.add(tf);
        tfl.add(tf1);
        tfl.add(tf2);

        for (Object o: tfl
             ) {add((Component) o);
        }

        // vertical line:

        JButton tfu = new JButton("*");
        tfu.setBounds(200,200,50,50);
        // add(tfu);
        JButton tfu1 = new JButton("&");
        tfu1.setBounds(200,250,50,50);
        // add(tfu1);
        JButton tfu2 = new JButton("%");
        tfu2.setBounds(200,300,50,50);
        // add(tfu2);

        List<Object> tfll = new ArrayList<>(){};

        tfll.add(tfu);
        tfll.add(tfu1);
        tfll.add(tfu2);

        for (Object o: tfll
        ) {add((Component) o);
        }


        setVisible(true);
    }










}
