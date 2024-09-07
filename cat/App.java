package ru.lesson6.cat;

public class App {

    public static void main(String[] args) {
        Cat c = new Cat("HFJ",3);
        Plate p = new Plate(100);
        c.eat(p);

        System.out.println(p.food);
    }
}
