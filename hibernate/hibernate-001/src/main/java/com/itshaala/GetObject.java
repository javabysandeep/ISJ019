package com.itshaala;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class GetObject {
    public static void main(String[] args) {
        //take help of hibernate to save this object in the table
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Product product = session.get(Product.class, 2);

        session.close();
        sessionFactory.close();
        System.out.println(product);

    }
}
