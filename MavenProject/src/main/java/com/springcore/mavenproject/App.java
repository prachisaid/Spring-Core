package com.springcore.mavenproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        ApplicationContext context  = new ClassPathXmlApplicationContext("classpath:/beans.xml");
        Student s1 = (Student) context.getBean("student1");
        Student s2 = context.getBean("student1", Student.class);
        
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
                
    }
}