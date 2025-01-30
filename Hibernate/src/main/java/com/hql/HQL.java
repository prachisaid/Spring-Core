package com.hql;

import com.springcore.hibernate.Student;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQL {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session s = factory.openSession();
        
        String query = "from Student";
        Query q = s.createQuery(query);
        
        List<Student> lst = q.list();
        
        for(Student std : lst) {
            System.out.println("HEllo");
            System.out.println(std.getName());
        }
        
        Student std = s.get(Student.class, 41456);
        System.out.println(std.getId() + " " + std.getName());
        
        System.out.println("Working on something");
        
        Student std1 = s.get(Student.class, 41456);
        System.out.println(std1.getId() + " " + std1.getName());
        
        s.close();
    }
}
 