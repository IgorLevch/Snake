package ru.lesson6.cat;

public class Plate {

    int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n){
        food -=n;
    }

}
