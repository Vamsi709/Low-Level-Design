package com.example.model.strategy;

import com.example.model.Payment;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("paying through creditcard");
    }
}
