package com.example.jettrxjavademo_20201014;

public class PizzaA extends Decorator{
    private Pizza pizza;
    public PizzaA(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+10;
    }

    @Override
    public String getName() {
        return pizza.getName()+"+菠萝";
    }
}
