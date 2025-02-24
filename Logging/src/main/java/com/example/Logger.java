package com.example;

public class Logger {
    private LoggingLevel currentLevel;
    private Logappender logAppender;

    public Logger(LoggingLevel currentLevel,Logappender logappender) {
        this.currentLevel = currentLevel;
        this.logAppender = logappender;
    }

    public void setCurrentLevel(LoggingLevel currentLevel) {
        this.currentLevel = currentLevel;
    }
    private void log(LoggingLevel level,String message){
        if (level.getPriority()>=currentLevel.getPriority()) {
            logAppender.append(level,message);

        }

    }
    public void debug(String message)
    {
        log(LoggingLevel.DEBUG, message);
    }
    public void info(String message) {
        log(LoggingLevel.INFO, message);
    }
    public void warn(String message) {
        log(LoggingLevel.WARN, message);
    }
    public void error(String message) {
        log(LoggingLevel.ERROR, message);
    }
    public void fatal(String message) {
        log(LoggingLevel.FATAL, message);
    }
}
