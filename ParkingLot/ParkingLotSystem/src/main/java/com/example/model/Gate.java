package com.example.model;

public abstract class Gate {
    private int gateNumber;
    private GateType gateType;
    private Operator operator;

    public Gate(int gateNumber, GateType gateType, Operator operator) {
        this.gateNumber = gateNumber;
        this.gateType = gateType;
        this.operator = operator;
    }

    public GateType getGateType() {
        return gateType;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public Operator getOperator() {
        return operator;
    }
}
