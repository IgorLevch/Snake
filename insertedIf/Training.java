package ru.lesson6.insertedIf;

import javax.swing.*;


public class Training {

    public static void main(String[] args) {

        String data;
        String w = "wolf";
        String b ="bear";
        String f ="fox";

        ImageIcon img;
        String file = "D:\\Экскременты в сети\\A task for inserted cycles";

        data = JOptionPane.showInputDialog(null,"Enter animal","The game",JOptionPane.INFORMATION_MESSAGE);
        if (data ==null){
            System.exit(0);
        }else if(data.equalsIgnoreCase(w)){
            file+="\\wolf.png";
            data = w;
        }else if(data.equalsIgnoreCase(b)){
            file+="\\bear.png";
            data=b;
        }else if (data.equalsIgnoreCase(f)){
            file+="\\fox.png";
            data=f;
        } else {
            file+="\\abrakadabra.png";
            data = "enter fox, wolf or bear";
        }
        img = new ImageIcon(file);
        JOptionPane.showMessageDialog(null,
                img,
                data,
                JOptionPane.WARNING_MESSAGE);

    }}

