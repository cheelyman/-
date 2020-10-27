package com.example.jettrxjavademo_20201014;

public abstract class Decorator extends Pizza{
    @Override
    public double getPrice() {
        return this.getPrice();
    }

    public void show(){
        System.out.println(getName()+" "+getPrice());
    }
}
