package com.example.DemoWebApplication.Services;

import com.example.DemoWebApplication.Models.Product;
import com.example.DemoWebApplication.Repo.ProdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {


//    List<Product> products =new ArrayList<>( Arrays.asList(new Product(100,"PS5",45000),
//            new Product(101,"PS4",22000),
//            new Product(102,"PS3",10000),
//            new Product(103,"PS2",5000),
//            new Product(104,"PS1",1000)));

    @Autowired
    ProdRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getSingleProduct(int prodId){
        return repo.findById(prodId).orElse(null);
//                products.stream().filter(p -> p.getProdId() == prodId)
//                .findFirst().orElse(new Product(0,"no products",0));
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public  void updateProduct(Product prod){
        repo.save(prod);
    }

    public void deleteProduct(int prodId){
        repo.deleteById(prodId);
    }
}
