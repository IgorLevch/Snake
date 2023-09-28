package game;

import javax.swing.*;

public class MyWindow extends JFrame {

    public MyWindow() {
        setTitle("Snake Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 300, 320, 345);
        add(new GameField());
        setVisible(true);


} }
