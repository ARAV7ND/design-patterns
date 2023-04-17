package com.designpatterns.singleton;

public class ThreadFoo implements Runnable{
    @Override
    public void run() {
        MyLogger logger = MyLogger.getInstance("Foo");
        System.out.println(logger.value);
    }
}
