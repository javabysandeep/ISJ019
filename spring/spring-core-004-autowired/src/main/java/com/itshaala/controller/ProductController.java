package com.itshaala.controller;

import com.itshaala.model.Product;
import com.itshaala.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {

    //it will assign the object to productService
    @Autowired
    private ProductService productService;

    public void add(Product product) {
        productService.add(product);
    }
}
