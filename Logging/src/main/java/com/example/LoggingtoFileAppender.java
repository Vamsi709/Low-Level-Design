package com.example;

public class LoggingtoFileAppender implements Logappender{


    @Override
    public void append(LoggingLevel loggingLevel, String Message) {
        System.out.println("logging through File:"+"[" + loggingLevel + "] " + Message);

    }
}
