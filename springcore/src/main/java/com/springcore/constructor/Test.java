package com.springcore.constructor;

import org.springframework.context.ApplicationContext;      
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/constructorconfig.xml");
        Person p = context.getBean("person", Person.class);
        Person p1 = context.getBean("person1", Person.class);
        System.out.println(p + "\n" + p1);
    }
}
