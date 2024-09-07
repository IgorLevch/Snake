package ru.lesson6.productIssue2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ProductRepository {

    private Map<Integer, Product> u = new ConcurrentHashMap<>();

    private AtomicInteger identity  = new AtomicInteger(0);




    // список всех продкутов:
    public List<Product> findAll(){
        return new ArrayList<>(u.values());  // это мы создали обертку для Мапы
    }


    // возврат продукта по его идентификтору:
    public Product findById(int id){
        return u.get(id);
    }

    // добавление нового продукта:
    public void insert (Product product){
        int id = identity.incrementAndGet();
        product.setId(id);
        u.put(id,product);

    }

    // изменение нового пользователя
    public void update (Product product){
        u.put(product.getId(), product);

    }

    // удаление нового пользователя
    public void delete (int id) {
        u.remove(id);

    }

    @Override
    public String toString() {
        return "ProductRepository{" +
                "u=" + u +
                ", identity=" + identity +
                '}';
    }
}
