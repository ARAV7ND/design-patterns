package com.designpatterns.singleton;

public class ThreadBar implements Runnable {
    @Override
    public void run() {
        MyLogger logger = MyLogger.getInstance("BAR");
        System.out.println(logger.value);
    }
}
