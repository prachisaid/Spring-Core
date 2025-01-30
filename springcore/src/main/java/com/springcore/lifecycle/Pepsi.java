/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private int prize;

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public Pepsi() {
    }

    @Override
    public String toString() {
        return "Pepsi{" + "prize=" + prize + '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside init method of pepsi");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destroy method of pepsi");
    }
    
    
}
