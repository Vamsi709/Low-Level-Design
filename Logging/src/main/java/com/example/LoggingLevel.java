package com.example;

public enum LoggingLevel {
    DEBUG(1),
    INFO(2),
    WARN(3),
    ERROR(4),
    FATAL(5),
    ;

    private final int priority;


    LoggingLevel(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
