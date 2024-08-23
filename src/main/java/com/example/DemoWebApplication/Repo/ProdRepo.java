package com.example.DemoWebApplication.Repo;

import com.example.DemoWebApplication.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdRepo extends JpaRepository<Product ,Integer> {
}
