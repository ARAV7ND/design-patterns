package com.designpatterns.factory.utils;

public class NumberUtils {
    public static boolean isNumeric(String str) {
        return str.matches("[0-9]+");
    }
}
