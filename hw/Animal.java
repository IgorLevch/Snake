package ru.lesson6.hw;

public abstract class Animal {

    protected String name;

    public static int count =0;
    public Animal() {
        count++;
    }

    public void run(int distance){
        if (distance>getMaxRunDistance()){
            return;
        }
        System.out.println("Running "+distance);

    }

    public void swim(int distance){
        if (distance>getMaxSwimDistance()){
            return;
        }
          System.out.println("swimming "+distance);
    }

    abstract int getMaxRunDistance();
    abstract int getMaxSwimDistance();

    public String getClazz(){
        return this.getClass().getSimpleName();
    }


}
