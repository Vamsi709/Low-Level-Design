package com.example.model.strategy;

public class DebitCard implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("paying through DebitCard");
    }
}
