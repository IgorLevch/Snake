package ru.lesson6.privv;




public class Main {


    public static void main(String[] args) {
      MyClass objA = new MyClass("Alpha");
      objA.show();
      MyClass objB = new MyClass("Betta");
      MyClass objC = new MyClass("Gamma");

      objA.show();
      objB.show();
      objC.show();

      objC.set("IUOOOA");
      objC.show();


    }
}