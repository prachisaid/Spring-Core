package com.springcore.stereotype;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Student {
    @Value("Prachi Said")
    private String studentName;
    
    @Value("Pune")
    private String city;
    
    @Value("12")
    private int roll;
    
    @Value("#{temp}")
    private List<String> address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "studentName=" + studentName + ", city=" + city + ", roll=" + roll + ", address=" + address + '}';
    }

    public Student() {
        
    }
    
    
}
