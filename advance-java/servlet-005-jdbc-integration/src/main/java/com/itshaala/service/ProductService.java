package com.itshaala.service;

import com.itshaala.dao.ProductDao;
import com.itshaala.model.Product;

import java.util.List;

public class ProductService {

    private ProductDao productDao = new ProductDao();

    public void add(Product product) {
        productDao.add(product);
    }

    public void update(Product product) {
        productDao.update(product);
    }

    public void delete(int id) {
        productDao.delete(id);
    }

    public Product getById(int id) {
        return productDao.getById(id);
    }

    public List<Product> getAll() {
        return productDao.getAll();
    }
}
