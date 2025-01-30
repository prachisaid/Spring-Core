/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 *
 * @author harsh
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spelconfig.xml");
        
        Demo demo = context.getBean("demo", Demo.class);
        
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression ex = parser.parseExpression("22+90");
        
        System.out.println(ex.getValue());
        
        System.out.println(demo);
    }
}
