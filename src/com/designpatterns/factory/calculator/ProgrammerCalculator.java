package com.designpatterns.factory.calculator;

import com.designpatterns.factory.calculator.interfaces.Calculator;
import com.designpatterns.factory.utils.NumberUtils;

public class ProgrammerCalculator implements Calculator {

    public double binaryToDecimal(String binary){
        return Integer.parseInt(binary, 2);
    }

    public int decimalToBinary(int decimal) {
        return Integer.parseInt(Integer.toBinaryString(decimal));
    }

    @Override
    public double calculate(String expression) {
        if(!NumberUtils.isNumeric(expression)){
            return binaryToDecimal(expression);
        }else {
            return decimalToBinary(Integer.parseInt(expression));
        }
    }
}
