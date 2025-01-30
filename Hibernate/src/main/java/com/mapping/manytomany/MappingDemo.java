package com.mapping.manytomany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        
        // Employees
        Emp e1 = new Emp();
        Emp e2 = new Emp();
        
        e1.seteId(34);
        e1.seteName("Ram");
        
        e2.seteId(35);
        e2.seteName("Shyam");
        
        // Projects
        Project p1 = new Project();
        Project p2 = new Project();
        
        p1.setPid(12121);
        p1.setPname("Library Management System");
        
        p2.setPid(14777);
        p2.setPname("ChatBot");
        
        // Setting Project And Employees
        List<Project> pList = new ArrayList<>();
        List<Emp> eList = new ArrayList<>();
        
        pList.add(p1);
        pList.add(p2);
        
        eList.add(e1);
        eList.add(e2);
        
        e1.setProjects(pList);
        e2.setProjects(new ArrayList<>(Arrays.asList(p2)));
        
        p2.setEmps(eList);
        p1.setEmps(new ArrayList<>(Arrays.asList(e1)));
        
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        
        s.save(e1);
        s.save(e2);
        s.save(p1);
        s.save(p2);
        
        tx.commit();
        
        s.close();
    }
}
