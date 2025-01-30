package com.springcore.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) {
        System.out.println("Program Started");
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session session = factory.openSession();
        
        Student s1 = session.get(Student.class, 41452);
        System.out.println(s1);
        
        session.close();
//        factory.close();
    }
}
