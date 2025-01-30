package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Reference injection");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/refbeans.xml");
        A obj = (A) context.getBean("aref");
        
        System.out.println(obj);
        System.out.println(obj.getX() + " " + obj.getOb().getY());
    }
}
