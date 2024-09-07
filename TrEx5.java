package ru.lesson6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

public class TrEx5 {

    public static void main(String[] args) {
       String k="OLALALALA";
       byte n[]= k.getBytes(StandardCharsets.UTF_8);
        try(RandomAccessFile r = new RandomAccessFile("D:\\Экскременты в сети\\for studying.txt","rw")){
            r.seek(5);
            r.write(n);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
