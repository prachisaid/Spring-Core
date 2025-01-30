package com.mapping.onetomany;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        // Creating Answer
        AnswerMany a1 = new AnswerMany(232, "Java is programming language");
        AnswerMany a2 = new AnswerMany(233, "Java uses the concept of WORA");
        
        // Creating question
        List<AnswerMany> lst = new ArrayList<>();
        lst.add(a1);
        lst.add(a2);
        QuestionMany q1 = new QuestionMany(1212, "What is Java?", lst);
        a1.setQuestion(q1);
        a2.setQuestion(q1);
        
        // Session
        Session s = factory.openSession();
        Transaction tr = s.beginTransaction();
        
        s.save(q1);
        s.save(a1);
        s.save(a2);
        
        tr.commit();
        
        
        QuestionMany newQ = s.get(QuestionMany.class, 1212);
        System.out.println(newQ);
        
        s.close();
        factory.close();
    }
}
