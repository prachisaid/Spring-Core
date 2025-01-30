package com.springcore.hibernate;

import java.io.IOException;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) throws IOException{
        System.out.println("Program Started");
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        // Creating student
        Student s1 = new Student();
        s1.setId(41455);
        s1.setName("Om");
        s1.setCity("Solapur");
        System.out.println(s1);
        
        Address a1 = new Address();
        a1.setStreet("Ekta nagar");
        a1.setIsOpen(true);
        a1.setAddedDate(new Date());
        a1.setX(444.32);
        System.out.println(a1);
        
        Session session = factory.openSession();
        
        Transaction trans = session.beginTransaction();
        
        session.save(s1);
        session.save(a1);
        
        trans.commit();
        
        session.close();
        
        System.out.println("Done");
    }
}
