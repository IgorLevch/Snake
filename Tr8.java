package ru.lesson6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;


/*Даны две строки строчных латинских символов: строка J и строка S. Символы, входящие в строку J, — «драгоценности»,
        входящие в строку S — «камни». Нужно определить, какое количество символов
        из S одновременно являются «драгоценностями». Проще говоря, нужно проверить,
        какое количество символов из S входит в J.
        Это разминочная задача, к которой мы размещаем готовые решения.
        Она очень простая и нужна для того, чтобы вы могли познакомиться
        с нашей автоматической системой проверки решений.
        Ввод и вывод осуществляется через файлы, либо через стандартные потоки ввода-вывода, как вам удобнее.*/

public class Tr8 {


        public static void main(String[] args) throws Exception {
            BufferedReader r = new BufferedReader(new FileReader("D:\\forYandex.txt"));

            String J = r.readLine();
            String S = r.readLine();

            int result = 0;
            for (int i = 0; i < S.length(); ++i) {
                char ch = S.charAt(i);
                if (J.indexOf(ch) >= 0) {
                    ++result;
                }
            }

            System.out.println(result);
        }
    }

