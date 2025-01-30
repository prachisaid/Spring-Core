/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * @author harsh
 */
public class Chutney {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Chutney() {
    }

    @Override
    public String toString() {
        return "Chutney{" + "price=" + price + '}';
    }
    
    @PostConstruct
    public void init() {
        System.out.println("Starting method");
    }
    
    @PreDestroy
    public void destroy() {
        System.out.println("Ending method");
    }
}
