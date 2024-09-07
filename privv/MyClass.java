package ru.lesson6.privv;

class MyClass {

    private static int count = 0;
    private int number;
    private String name;

     MyClass(String n) {

         count++;

        number = count;
        name = n;

         System.out.println("A new object was created "+name+" "+count);
    }

    void show(){
        System.out.println(name);
        System.out.println(number);
        System.out.println(count);
    }

    void set(String n){
         name =n;

    }



}
