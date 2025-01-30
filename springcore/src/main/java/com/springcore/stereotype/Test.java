package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/stereoconfig.xml");
        
        Student student = context.getBean("student", Student.class);
        Student st1 = context.getBean("student", Student.class);
        
        System.out.println(student.hashCode() + "\n" + st1.hashCode());
    }
}
