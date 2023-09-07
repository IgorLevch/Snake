package ru.lesson6.constructor;

public class MyClass {

  int number;
  char symbol;


    MyClass() {
       number = 115;
       symbol = 'L';
    }


    MyClass(int n, char s) {
        number = n;
        symbol = s;
    }


    void show(){
        System.out.println(number+"  "+symbol);
    }
}
