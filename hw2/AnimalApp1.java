package ru.lesson6.hw2;

import java.util.Random;

public class AnimalApp1 {


    public static void main(String[] args) {

        Random random = new Random();
        Animal1[] an = new Animal1[10];

        for (int i = 0; i < an.length; i++) {
            switch(i%3){
                case 0:
                    an[i] = new Cat1(random.nextInt(100), random.nextInt(50) );
                    break;
                case 1:
                    an[i] = new Dog1();
                    break;
                case 2:
                    an[i]=new Elephant1();
                    break;
            }
        }

        for(Animal1 a:an){
            System.out.println(a.getClazz());
            a.run(random.nextInt(300));
            a.swim(random.nextInt(150));

        }
        System.out.println("Totally: "+Animal1.count);
    }

}
