package com.springcore.constructor;

public class Person {
    private String name;
    private int age;
    private Certi cert;

    public Person(String name, int age, Certi cert) {
        this.name = name;
        this.age = age;
        this.cert = cert;
    }
    
    public Person() {
        
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", c=" + cert + '}';
    }
    
}
