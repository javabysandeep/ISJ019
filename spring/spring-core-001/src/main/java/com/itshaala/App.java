package com.itshaala;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //starting the spring container
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.cfg.xml");

        //get the bean/object from Spring
        Product product = context.getBean("product", Product.class);

        System.out.println(product);
    }
}
