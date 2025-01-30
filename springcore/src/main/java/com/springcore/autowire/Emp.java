/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.autowire;

/**
 *
 * @author harsh
 */
public class Emp {
    private Address address;

    public Address getAddress() {
        return address;
    }

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
