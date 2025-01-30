package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/refconfig.xml");
        A a = context.getBean("aref", A.class);
        A a1 = context.getBean("aref2", A.class);
        System.out.println(a + "\n" + a1);
    }
}
