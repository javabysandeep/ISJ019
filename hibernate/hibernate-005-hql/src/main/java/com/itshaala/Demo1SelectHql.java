package com.itshaala;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;


public class Demo1SelectHql {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

        //Query<Student> query = session.createQuery("from Student", Student.class);
        //Query<Student> query = session.createQuery("from Student where student_id=2", Student.class);
        Query<Student> query = session.createQuery("from Student where student_id > 2", Student.class);

        List<Student> students = query.list();


        students.forEach(System.out::println);

        session.close();
        sessionFactory.close();
    }
}
