package ru.lesson6.hw2;

public class Cat1 extends Animal1 {

    private int maxRunDistance;
    private int maxSwimDistance;

    public Cat1(int maxRunDistance, int maxSwimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    /*@Override
    public void run(int distance) {
        if (distance>maxRunDistance){
            System.out.println("Cattie don' t run such distances: "+distance+" "+maxRunDistance);
            return;
        }
        super.run(distance);
    }

    @Override
    public void swim(int distance) {
        //super.swim(distance);
        System.out.println("cats don't swim");
    }*/

    @Override
    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }
}
