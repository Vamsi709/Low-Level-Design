package com.example.model;

import java.time.LocalDateTime;

public class Bill {
    private Ticket ticket;
    private LocalDateTime exitTime;
    private int amounttobePaid;
    private Operator generatedBy;

    public Bill(Ticket ticket, LocalDateTime exitTime, int amounttobePaid, Operator generatedBy) {
        this.ticket = ticket;
        this.exitTime = exitTime;
        this.amounttobePaid = amounttobePaid;
        this.generatedBy = generatedBy;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }


    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }


    public int getAmounttobePaid() {
        return amounttobePaid;
    }

    public void setAmounttobePaid(int amounttobePaid) {
        this.amounttobePaid = amounttobePaid;
    }
}
