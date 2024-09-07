package ru.lesson6.staticc;

public class Demo {


    public static void main(String[] args) {

        MyClass.show();

        MyClass objA = new MyClass();
        objA.show();
        MyClass.show();
        MyClass objB = new MyClass();
        MyClass objC = new MyClass();
        int v = MyClass.count;
        v =909;

        MyClass.show();

        objB.show();
        objC.show();

        System.out.println(v );

    }

}
