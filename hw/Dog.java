package ru.lesson6.hw;

public class Dog extends Animal {

    private static final int MAX_RUN_DISTANCE = 200;
    private static final int MAX_SWIM_DISTANCE = 20;

    @Override
    public void run(int distance) {
        if (distance>MAX_RUN_DISTANCE){
            System.out.println("Dogs don't run such distances");
            return;
        }
        super.run(distance);
    }

    @Override
    public void swim(int distance) {
        if (distance>MAX_SWIM_DISTANCE){
            System.out.println("Dogs don't swim such distances");
            return;
        }
        System.out.println("dog swam "+distance+" meters");
    }

    @Override
    int getMaxRunDistance() {
    return MAX_RUN_DISTANCE;
    }

    @Override
    int getMaxSwimDistance() {
    return MAX_SWIM_DISTANCE;
    }
}
