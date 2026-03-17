package com.itshaala;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        //step 01 : start the container
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);

        //step 02 : get the bean
        Product product = context.getBean("product", Product.class);

        // step 03: print
        System.out.println(product);


        //environment object stores the content of properties file
        System.out.println("environment object stores the content of properties file");
        Environment environment = context.getEnvironment();
        System.out.println("product id = " + environment.getProperty("product.id"));
        System.out.println("product name = " + environment.getProperty("product.name"));
        System.out.println("product price = " + environment.getProperty("product.price"));




    }
}
