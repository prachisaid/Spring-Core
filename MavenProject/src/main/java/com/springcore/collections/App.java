package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Employee Details");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/collectionbeans.xml");
        Emp emp1 = (Emp) context.getBean("emp1");
        System.out.println(emp1);
    }
}
