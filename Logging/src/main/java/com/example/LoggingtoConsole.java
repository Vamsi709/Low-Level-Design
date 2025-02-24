package com.example;

public class LoggingtoConsole implements Logappender{


    @Override
    public void append(LoggingLevel loggingLevel, String Message) {
        System.out.println("logging through Console:"+"[" + loggingLevel + "] " + Message);

    }
}
