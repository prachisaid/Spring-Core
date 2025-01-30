package com.springcore.lifecycle;

public class Samosa {
    private int prize;

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        System.out.println("Setting properties");
        this.prize = prize;
    }

    public Samosa() {
    }

    @Override
    public String toString() {
        return "Samosa{" + "prize=" + prize + "}\n";
    }
    
    public void init() {
        System.out.println("Inside init methods");
    }
    
    public void destroy() {
        System.out.println("Inside destroy methods");
    }
}
