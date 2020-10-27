package com.example.jettrxjavademo_20201014;

public class BasePizza extends Pizza {

    @Override
    public String getName() {
        this.name="Pizza";
        return super.getName();
    }
    @Override
    public double getPrice() {
        return 50.00;
    }
}
