package ru.lesson6.productIssue2;

public class Product {

    private int id;
    private String title;



    public Product(int i, String title) {

        this.title = title;

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return  "Product: { "+this.title+"}";
    }

}
