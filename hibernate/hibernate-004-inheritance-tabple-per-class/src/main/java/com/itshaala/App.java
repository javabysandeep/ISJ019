package com.itshaala;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class App {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setName("Bhushan");


        FullTimeEmployee fte = new FullTimeEmployee();
        fte.setName("Ahushutosh");
        fte.setSalary(5000);

        ContractEmployee cte = new ContractEmployee();
        cte.setName("ALi");
        cte.setInvoiceAmount(50000);

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(emp);
        session.persist(fte);
        session.persist(cte);

        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("employee objects saved");
    }
}
