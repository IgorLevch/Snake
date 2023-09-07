package ru.lesson6.constructor;



public class UsingConstructor {

    public static void main(String[] args) {

        MyClass objA = new MyClass();
        MyClass objB = new MyClass(899,'P');

        objA.show();
        objB.show();


    }

}
