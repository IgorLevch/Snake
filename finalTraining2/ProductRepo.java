package ru.lesson6.finalTraining2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductRepo {



   private ArrayList<Product> pr = new ArrayList<>(Arrays.asList(
           new Product(1,"assa",true,5,'e'),
           new Product(2,"massa",false,788,'t'),
           new Product(3,"tyui",true,5466,'w')
   ));





   public Product findById(Integer id){

        return pr.stream().filter(p->p.getId().equals(id)).findFirst().orElseThrow(RuntimeException::new);
   }

}
