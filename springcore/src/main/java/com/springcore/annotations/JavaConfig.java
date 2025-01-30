package com.springcore.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan(basePackages = "com.springcore.annotations")
public class JavaConfig {
    
    @Bean
    public Samosa getSamosa() {
        Samosa samosa = new Samosa();
        return samosa;
    }
    
    @Bean
    public Student getStudent() {
        Student student = new Student(41471, "Prachi Said", "BE4");
        return student;
    }
    
}
