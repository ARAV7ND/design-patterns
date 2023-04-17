package com.designpatterns.factory.calculator;

import com.designpatterns.factory.calculator.interfaces.Calculator;

public class BasicCalculator implements Calculator {

    public double add(int num1, int num2) {
        return num1 + num2;
    }

    public double subtract(int num1, int num2) {
        return num1 - num2;
    }

    public double multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        return num1 / num2;
    }

    @Override
    public double calculate(String expression) {
        String[] commandLineArgs = expression.split(" ",3);
        String operation = commandLineArgs[1];
        int num1 = Integer.parseInt(commandLineArgs[0]);
        int num2 = Integer.parseInt(commandLineArgs[2]);

        switch (operation) {
            case "+":
                return add(num1, num2);
            case "-":
                return subtract(num1, num2);
            case "/":
                return divide(num1, num2);
            case "*":
                return multiply(num1, num2);
            default:
                return 0;
        }
    }
}
