package ru.lesson6;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class TrEx4 {

    public static void main(String[] args) throws IOException {
      /* String str = "Pits-pots_lalalalala\n";  // строковый массив
       byte[] b = str.getBytes(StandardCharsets.UTF_8);  // переводим в байты

        try(OutputStream writer = new BufferedOutputStream(new FileOutputStream("D:\\Экскременты в сети\\for studying55.txt"))){
            for (int i = 0; i < 15; i++) {     //  записываем байты в файл буферизированным потоком
                writer.write(b);
            }
        } */

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Экскременты в сети\\for studying66.txt",true))){
            for (int i = 0; i < 15; i++) {
                writer.write("Lalala_lalala\n");
            }
        }


        }
}
