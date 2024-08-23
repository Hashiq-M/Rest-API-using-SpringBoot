package com.example.DemoWebApplication.Models;



import org.springframework.stereotype.Component;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Component
@Table(name = "product")
@Entity
public class Product {
    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(int prodPrice) {
        this.prodPrice = prodPrice;
    }

    @Id
    @Column(name = "prod_id")
    private int prodId;

    @Column(name = "prod_name")
    private String prodName;

    @Column(name = "prod_price")
    private int prodPrice;
}
