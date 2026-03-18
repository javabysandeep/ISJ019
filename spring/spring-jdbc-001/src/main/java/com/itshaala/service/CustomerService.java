package com.itshaala.service;

import com.itshaala.dao.CustomerDao;
import com.itshaala.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void add(Customer customer) {
        customerDao.add(customer);
    }

    public void update(Customer customer) {
        customerDao.update(customer);
    }

    public void delete(int customerId) {
        customerDao.delete(customerId);
    }

    public Customer getCustomer(int customerId) {
        return customerDao.getCustomer(customerId);
    }
}
