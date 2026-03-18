package com.itshaala.controller;

import com.itshaala.model.Customer;
import com.itshaala.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    public void add(Customer customer) {
        customerService.add(customer);
    }

    public void update(Customer customer) {
        customerService.update(customer);
    }

    public void delete(int customerId) {
        customerService.delete(customerId);
    }

    public Customer getCustomer(int customerId) {
        return customerService.getCustomer(customerId);
    }

}
