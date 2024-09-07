package ru.lesson6;

public class Product {
    int id;
    String title;
    int cost;


    public Product(int id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public Product setId(int id) {
        this.id = id;
        return null;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product: { id =  " +this.id+", title = "+this.title+", cost = "+this.cost+"}";
    }

}
