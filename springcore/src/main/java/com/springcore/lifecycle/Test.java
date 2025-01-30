/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.lifecycle;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author harsh
 */
public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:/lifecycleconfig.xml");
        
        Samosa s1 = context.getBean("s1", Samosa.class);
        Pepsi p1 = context.getBean("p1", Pepsi.class);
        Chutney c1 = context.getBean("c1", Chutney.class);
        
        System.out.println(s1);
        System.out.println("_________________________________________\n");
        System.out.println(p1);
        System.out.println("_________________________________________\n");
        System.out.println(c1);
        context.registerShutdownHook();
    }
}
