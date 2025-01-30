/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author harsh
 */
public class Emp {
    @Autowired
    @Qualifier("address2")
    private Address address;

    public Address getAddress() {
        return address;
    }

//    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    public Emp() {
    }

    public Emp(Address address) {
        System.out.println("Inside constructor");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" + "address=" + address + '}';
    }
}
