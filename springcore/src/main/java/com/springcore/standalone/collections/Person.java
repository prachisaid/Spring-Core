/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.standalone.collections;

import java.util.*;

/**
 *
 * @author harsh
 */
public class Person {
    private List<String> friends;
    private Set<String> courses;
    private Map<String, Integer> feestructure;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Set<String> getCourses() {
        return courses;
    }

    public void setCourses(Set<String> courses) {
        this.courses = courses;
    }

    public Map<String, Integer> getFeestructure() {
        return feestructure;
    }

    public void setFeestructure(Map<String, Integer> feestructure) {
        this.feestructure = feestructure;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" + "friends=" + friends + ", courses=" + courses + ", feestructure=" + feestructure + '}';
    }

    

    
}
