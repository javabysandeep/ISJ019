package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        //01. start the container
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);

        //02. get the bean from container
        Product product = context.getBean("product", Product.class);


        //03. print object
        System.out.println(product);
    }
}
