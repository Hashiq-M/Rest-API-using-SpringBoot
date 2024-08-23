package com.example.DemoWebApplication.Controllers;

import com.example.DemoWebApplication.Models.Product;
import com.example.DemoWebApplication.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable int prodId){
        Product product = service.getSingleProduct(prodId);
        if( product != null){
            return new ResponseEntity<>( product, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping("/products")
    public void addProducts(@RequestBody Product prod){
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }


}
