package com.itshaala;

import com.itshaala.configuration.SpringConfiguration;
import com.itshaala.controller.ProductController;
import com.itshaala.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);

        ProductController productController = context.getBean(ProductController.class);

        productController.add(new Product(1, "mobile", 9090));
    }
}
