package ru.lesson6.productIssue;

public class ProductService {

    private  ProductRepository productRepository;

    public String  getTitlebyId(int id){
        return productRepository.findById(id).getName();

    }
}
