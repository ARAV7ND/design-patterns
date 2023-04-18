package com.designpatterns.factory;

import com.designpatterns.factory.calculator.interfaces.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please select the calculator mode i.e., <Basic|Scientific|Programming>");
        String mode = sc.next();
        sc.nextLine();
        String commandLineInput;

        switch (mode){
            case "Basic":
                Calculator calculator = CalculatorFactory.getCalculator("Basic");
                System.out.println("Enter two numbers in the format of '<operand> <operator> <operand>'. 'ex: 1 + 2' ");
                commandLineInput = sc.nextLine();
                System.out.println(calculator.calculate(commandLineInput));
                break;

            case "Scientific":
                Calculator scientificCalculator = CalculatorFactory.getCalculator("Scientific");
                System.out.println("Enter an operand and operator in the format of '<sine|cosine|tan> <operand>'. 'ex: sine 0' ");
                commandLineInput = sc.nextLine();
                System.out.println(scientificCalculator.calculate(commandLineInput));
                break;

            case "Programming":
                Calculator programingCalculator = CalculatorFactory.getCalculator("Programming");
                System.out.println("Enter binary or decimal number to perform the operations `ex: 113` ");
                commandLineInput = sc.next();
                System.out.println(programingCalculator.calculate(commandLineInput));
                break;
            default :
                System.out.println("Exited with unknown calculator mode");
                System.exit(0);
        }

    }
}
