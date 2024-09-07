package ru.lesson6.staticc;

public class MyClass {

    static int count;

    public MyClass() {

        count++;
        System.out.println("A new object number "+count);
    }

    public static void show(){
        System.out.println(count);

    }
}
