package com.itshaala;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class DeleteObject {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(2);
        product.setName("water bottle electric");
        product.setPrice(3000);

        //take help of hibernate to save this object in the table
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.remove(product);

        transaction.commit();

        session.close();
        sessionFactory.close();
        System.out.println("product object deleted successfully");

    }
}
