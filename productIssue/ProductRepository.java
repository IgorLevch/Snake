package ru.lesson6.productIssue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepository {
    public static ArrayList<Product> produc;




    public static Product findById(int id){

        return produc.stream().filter(p-> {
            return Objects.equals(p.getId(), id);
        }).findFirst().orElseThrow(()->new RuntimeException());

}}
