package com.example.model.strategy;

public class UPI implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paying through UPI"+amount);
    }
}
