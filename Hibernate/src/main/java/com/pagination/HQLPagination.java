package com.pagination;

import com.springcore.hibernate.Student;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLPagination {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session s = factory.openSession();
        
        String query = "from Student";
        Query q = s.createQuery(query); 
        
        q.setFirstResult(1);
        q.setMaxResults(3);
        
        List<Student> lst = q.list();
        
        for(Student std : lst) {
            System.out.println(std.getName() + " " + std.getCity() + " " + std.getId());
        }
        
    }
}
