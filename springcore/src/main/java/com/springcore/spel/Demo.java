/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    
    @Value("#{22 + 11}")
    private int x;
    
    @Value("#{8>6?88:55}")
    private int y;
    
    @Value("#{T(java.lang.Math).sqrt(32)}")
    private double z;
    
    @Value("#{T(java.lang.Math).E}")
    private double e;
    
    @Value("#{new java.lang.String('Prachi Said')}")
    private String name;
    
    @Value("#{T(com.springcore.Student).hello(3)}")
    private int diff;
    
    @Value("#{8>3}")
    private boolean isActive;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiff() {
        return diff;
    }

    public void setDiff(int diff) {
        this.diff = diff;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Demo{" + "x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", diff=" + diff + ", isActive=" + isActive + '}';
    }
}
