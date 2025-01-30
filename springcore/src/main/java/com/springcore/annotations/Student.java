package com.springcore.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private int roll;
    private String name;
    private String div;
    
    @Autowired
    private Samosa samosa;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    public Student(int roll, String name, String div) {
        this.roll = roll;
        this.name = name;
        this.div = div;
    }
    
    public void study() {
        this.samosa.samosaDisplay();
        System.out.println("Student is studying");
    }
}
