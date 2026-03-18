package com.itshaala.dao;

import com.itshaala.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class CustomerDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void add(Customer customer) {
        String query = "insert into customers(id,name,email,phone) values(?,?, ?, ?)";
        jdbcTemplate.update(query, customer.getId(), customer.getName(), customer.getEmail(), customer.getPhone());
        System.out.println("Customer added");
    }

    public void update(Customer customer) {
        String query = "update customers set name = ?, email = ?, phone = ? where id = ?";
        jdbcTemplate.update(query, customer.getName(), customer.getEmail(), customer.getPhone(), customer.getId());
        System.out.println("Customer updated");
    }

    public void delete(int customerId) {
        String query = "delete from customers where id = ?";
        jdbcTemplate.update(query, customerId);
        System.out.println("Customer deleted");
    }

    public Customer getCustomer(int customerId) {
        String query = "select * from customers where id = ?";

        return jdbcTemplate.queryForObject(query, new RowMapper<Customer>() {
            @Override
            public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
                Customer customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setName(rs.getString("name"));
                customer.setEmail(rs.getString("email"));
                customer.setPhone(rs.getString("phone"));
                return customer;
            }
        }, customerId);
    }
}
