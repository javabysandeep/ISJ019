package com.itshaala.service;

import com.itshaala.dao.ProductDao;
import com.itshaala.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public void add(Product product) {
        productDao.add(product);
    }
}
