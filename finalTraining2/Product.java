package ru.lesson6.finalTraining2;

public class Product {

    Integer id;
    String title;
    Boolean exists;
    Integer age;
    Character symb;


    public Product(Integer id, String title, Boolean exists, Integer age, Character symb) {
        this.id = id;
        this.title = title;
        this.exists = exists;
        this.age = age;
        this.symb = symb;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getExists() {
        return exists;
    }

    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getSymb() {
        return symb;
    }

    public void setSymb(Character symb) {
        this.symb = symb;
    }
}
