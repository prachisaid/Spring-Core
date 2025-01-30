package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/config.xml");
        Student s1 = context.getBean("student", Student.class);
        Student s2 = context.getBean("student2", Student.class);
        Student s3 = context.getBean("student3", Student.class);
        System.out.println(s1 + "\n" + s2 + "\n" + s3);
    }
}
