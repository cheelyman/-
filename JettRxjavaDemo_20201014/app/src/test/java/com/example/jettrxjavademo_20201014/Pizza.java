package com.example.jettrxjavademo_20201014;

public abstract class Pizza {
    protected String name;
    public String getName(){
        return this.name;
    }
    public abstract double getPrice();
}
