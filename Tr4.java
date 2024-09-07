package ru.lesson6;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;

public class Tr4 {

public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new
            FileReader("D:\\forYandex.txt"))) {
        String str;
        while ((str = reader.readLine()) != null) {

            System.out.print(str);
            System.exit(0);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    Scanner sc = new Scanner(System.in);
    String st = sc.next();

    String[] numbers = st.split(" ");
    int res = 0;
    try{
        for (String s : numbers) {
            res += Integer.parseInt(s);
        }
        System.out.println("Summa: " + res);
    } catch(Exception e) {
        System.out.println("Vveli ne chisla!");
    }


}




}


