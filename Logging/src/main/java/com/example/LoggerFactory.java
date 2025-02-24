package com.example;

public class LoggerFactory {
    public static Logappender getLogappender(String loggerType){
        switch (loggerType.toUpperCase()){
            case "CONSOLE":
                return new LoggingtoConsole();
            case "FILE":
                return new LoggingtoFileAppender();
            default:
                throw new IllegalArgumentException("Error");

        }
    }
}
