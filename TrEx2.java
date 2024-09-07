package ru.lesson6;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class TrEx2 {


    public static void main(String[] args) throws IOException {
      BufferedInputStream in = new BufferedInputStream(new FileInputStream("D:\\Экскременты в сети\\for studying.txt"));
        //  BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("D:\\Экскременты в сети\\for studying2.txt",true));

      int c;

      while((c=in.read())!=-1){
         // out.write(c);
      //    c=in.read();
          out.print((char)c);
      }
      //  out.flush();


        }



    }




