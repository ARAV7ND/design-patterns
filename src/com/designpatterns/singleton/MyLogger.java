package com.designpatterns.singleton;

public class MyLogger {
    private static MyLogger logger = null;
    public String value;
    private MyLogger(String value) {
        this.value = value;
    }

    public void warn(String msg) {
        System.out.println("warn::" + msg);
    }

    public void info(String msg) {
        System.out.println("info::" + msg);
    }

    public void err(String msg) {
        System.out.println("err::" + msg);
    }

    public static MyLogger getInstance(String value) {

        if (logger == null) {
            synchronized (MyLogger.class) {
                if (logger == null) {
                    logger = new MyLogger(value);
                }
            }
        }
        return logger;
    }
}
