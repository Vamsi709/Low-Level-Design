package com.example.Strategy.FeesCalucalation;

public class OffSeason implements FeeCalucalationStrategy {
    private int rate;

    public OffSeason(int rate) {
        this.rate = rate;
    }

    @Override
    public int calucalateFee(int hours) {
        return hours*rate;

    }
}
