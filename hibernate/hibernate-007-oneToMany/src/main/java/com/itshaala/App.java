package com.itshaala;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("123 Main Street");
        address.setCity("New York");
        address.setState("NY");
        address.setCountry("US");
        address.setPincode("123");

        Address address1 = new Address();
        address1.setStreet("Baner");
        address1.setCity("Pune");
        address1.setState("MH");
        address1.setCountry("India");
        address1.setPincode("123");

        Employee employee = new Employee();
        employee.setName("bhushan");
        employee.setSalary("100000");
        employee.setAddresses(List.of(address, address1));

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(address);
        session.persist(address1);
        session.persist(employee);
        tx.commit();
        session.close();
        sf.close();
        System.out.println("employee object saved");

    }
}
