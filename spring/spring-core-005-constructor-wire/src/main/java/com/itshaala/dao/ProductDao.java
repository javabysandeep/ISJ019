package com.itshaala.dao;

import com.itshaala.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
//@AllArgsConstructor
public class ProductDao {

    public void add(Product product) {
        System.out.println("Product saved successfully");
        System.out.println(product);
    }
}
