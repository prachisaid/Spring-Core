package com.springcore.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {
    public static void main(String[] args) {
        System.out.println("Program Started");
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        // Creating student
        Student s1 = new Student();
        s1.setId(41455);
        s1.setName("Om");
        s1.setCity("Solapur");
        
        Certificate certi = new Certificate();
        certi.setCourse("Android");
        certi.setDuration("2 months");
        
        s1.setCerti(certi);
        
        Student s2 = new Student();
        s2.setId(41450);
        s2.setName("Ravi");
        s2.setCity("Solapur");
        
        Certificate certi1 = new Certificate();
        certi1.setCourse("Java");
        certi1.setDuration("6 months");
        
        s2.setCerti(certi1);
        
        Session session = factory.openSession();
        
        Transaction trans = session.beginTransaction();
        
        session.save(s1);
        session.save(s2);
        
        trans.commit();
        
        session.close();
        factory.close();
    }
}
