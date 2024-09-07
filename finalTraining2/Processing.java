package ru.lesson6.finalTraining2;

public class Processing {

    ProductRepo  pr2= new ProductRepo();

    public String setTitlebyId(Integer id){
      //  return pr2.findById(id).getTitle();
        return pr2.findById(id).title;

    }

    public Character setCharbyId(Integer id){
        //return pr2.findById(id).getSymb();
        return pr2.findById(id).symb;

    }

    public Boolean setitlebyId(Integer id){
        //return pr2.findById(id).getExists();
        return pr2.findById(id).exists;

    }


}
