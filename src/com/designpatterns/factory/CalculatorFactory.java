package com.designpatterns.factory;

import com.designpatterns.factory.calculator.BasicCalculator;
import com.designpatterns.factory.calculator.interfaces.Calculator;
import com.designpatterns.factory.calculator.ProgrammerCalculator;
import com.designpatterns.factory.calculator.ScientificCalculator;

public class CalculatorFactory {

    public static Calculator getCalculator(String mode) {
        switch (mode) {
            case "Basic":
                return new BasicCalculator();
            case "Scientific":
                return new ScientificCalculator();
            case "Programming":
                return new ProgrammerCalculator();
            default:
                return null;
        }
    }
}
