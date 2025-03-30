package com.example.Strategy.FeesCalucalation;

public class OnSeason implements FeeCalucalationStrategy{
    private int rate;

    public OnSeason(int rate) {
        this.rate = rate;
    }

    @Override
    public int calucalateFee(int hours) {
        return rate*hours;
    }
}
