package ru.lesson6.hw;

import java.util.Random;

public class PersonApp {

    public static void main(String[] args) {
        Random random = new Random();
        Person[] persons = new Person[10];

        for (int i = 0; i < persons.length; i++) {
            Person.Builder builder = new Person.Builder();
            builder.withName("Person "+i).withAge(random.nextInt(70));
            if (i%3==0){builder.withSalary(random.nextInt(1000));}
            persons[i] = builder.build();}
            //persons[i]= new Person("Person "+i, random.nextInt(70));


        for (Person person:persons){
            if (person.getAge() <40){
                continue;
            }
            person.info();
        }

         Person person = Person.builder().withName("Name").withAge(35).build();
        System.out.println(person);



}}
