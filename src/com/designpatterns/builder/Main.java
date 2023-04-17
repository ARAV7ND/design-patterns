package com.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        Payslip payslip = new Payslip.Builder("John Doe", 123, 50000)
                .withHRA(15000)
                .withDA(10000)
                .withOtherAllowances(5000)
                .withPF(6000)
                .withESI(3000)
                .withTax(10000)
                .build();

        System.out.println(payslip);
    }
}
