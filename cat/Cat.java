package ru.lesson6.cat;

public class Cat {

    String name;
    int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p){
    p.decreaseFood(appetite);

    }

}
