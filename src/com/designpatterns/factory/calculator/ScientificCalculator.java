package com.designpatterns.factory.calculator;

import com.designpatterns.factory.calculator.interfaces.Calculator;

public class ScientificCalculator implements Calculator {

    public double findSine(int num){
        return Math.sin(num);
    }

    public double findCosine(int num){
        return Math.cos(num);
    }

    public double findTan(int num){
        return Math.tan(num);
    }

    @Override
    public double calculate(String expression) {
        String[] commandLineArgs = expression.split(" ",2);
        String operation = commandLineArgs[0];
        int num = Integer.parseInt(commandLineArgs[1]);
        switch (operation){
            case "sine":
                return findSine(num);
            case "cosine":
                return findCosine(num);
            case "tan":
                return findTan(num);
            default:
                return 0;
        }
    }
}

