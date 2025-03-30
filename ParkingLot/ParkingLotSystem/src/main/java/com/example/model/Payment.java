package com.example.model;

public  class Payment {
    private Bill bill;
    private PaymentStatus paymentStatus;
    private long id;

    public Payment(Bill bill, PaymentStatus paymentStatus, long id) {
        this.bill = bill;
        this.paymentStatus = paymentStatus;
        this.id = id;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
