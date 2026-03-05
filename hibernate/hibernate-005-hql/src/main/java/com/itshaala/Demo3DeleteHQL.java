package com.itshaala;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class Demo3DeleteHQL {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "delete from Student where student_id=:student_id";
        Query query = session.createQuery(hql);
        query.setParameter("student_id", 4);
        query.executeUpdate();
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Student record deleted");
    }
}
