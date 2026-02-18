package com.itshaala;


import com.itshaala.controller.ProductController;
import com.itshaala.model.Product;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id, name and price");
        int productId = scanner.nextInt();
        String productName = scanner.next();
        int productPrice = scanner.nextInt();

        Product product = new Product();
        product.setId(productId);
        product.setName(productName);
        product.setPrice(productPrice);*/

        ProductController productController = new ProductController();
        //productController.add(product);
        // productController.update(product);
        // productController.delete(productId);
        // System.out.println(productController.getById(14));
        List<Product> productList = productController.getAll();
        productList.forEach(System.out::println);
    }
}
