package com.itshaala.dao;

import com.itshaala.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
    public void add(Product product) {
        System.out.println("Product saved successfully");
        System.out.println(product);
    }
}
