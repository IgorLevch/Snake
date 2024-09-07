package ru.lesson6.hw2;

public abstract class Animal1 {

    protected  static int count=0;

    public Animal1() {
        count++;
    }

    public void run(int distance){
        if (distance > getMaxRunDistance()) {
            System.out.println("Too long a disrtance "+distance+" "+getMaxRunDistance());
            return;
        }

        System.out.println("I ran "+distance);
    }

    public void swim (int distance){

        if (distance > getMaxSwimDistance()) {
            System.out.println("Too long a disrtance "+distance+" "+getMaxSwimDistance());
            return;}

        System.out.println("I swam "+distance);
    }

    public String getClazz(){
        return this.getClass().getSimpleName();
    }

    public abstract int getMaxRunDistance();


    public abstract int getMaxSwimDistance();


}
