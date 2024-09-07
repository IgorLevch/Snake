package ru.lesson6.hw2;

public class Dog1 extends Animal1 {

    private static final int MAX_RUN_DISTANCE = 200;
    private static final int MAX_SWIM_DISTANCE = 75;

  /*  @Override
    public void run(int distance) {
        if (distance>MAX_RUN_DISTANCE){
            System.out.println("Doggie don' t run such distances: "+distance+" "+MAX_RUN_DISTANCE);
            return;
        }

        super.run(distance);
    }

    @Override*/
    /*public void swim(int distance) {
        if (distance>MAX_SWIM_DISTANCE){
            System.out.println("Doggie don' t swim such distances: "+distance+" "+MAX_SWIM_DISTANCE);
            return;
        }

        super.swim(distance);
    }*/

    @Override
    public int getMaxRunDistance() {
        return MAX_RUN_DISTANCE;
    }

    @Override
    public int getMaxSwimDistance() {
        return MAX_SWIM_DISTANCE;
    }


}
