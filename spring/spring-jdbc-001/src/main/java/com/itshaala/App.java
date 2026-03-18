package com.itshaala;

import com.itshaala.configuration.SpringConfiguration;
import com.itshaala.controller.CustomerController;
import com.itshaala.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(2);
        customer.setName("Rohan");
        customer.setEmail("rohan.11@gmail.com");
        customer.setPhone("123456");


        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        CustomerController customerController = context.getBean(CustomerController.class);
        //customerController.add(customer);
        //customerController.update(customer);
       // customerController.delete(101);
        System.out.println(customerController.getCustomer(1));
    }
}
