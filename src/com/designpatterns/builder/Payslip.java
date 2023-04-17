package com.designpatterns.builder;

public class Payslip {
    private String employeeName;
    private int employeeId;
    private double basicPay;
    private double hra;
    private double da;
    private double otherAllowances;
    private double grossSalary;
    private double pf;
    private double esi;
    private double tax;
    private double deductions;
    private double netSalary;

    private Payslip() {
    }

    public static class Builder {
        private String employeeName;
        private int employeeId;
        private double basicPay;
        private double hra;
        private double da;
        private double otherAllowances;
        private double pf;
        private double esi;
        private double tax;

        public Builder(String employeeName, int employeeId, double basicPay) {
            this.employeeName = employeeName;
            this.employeeId = employeeId;
            this.basicPay = basicPay;
        }

        public Builder withHRA(double hra) {
            this.hra = hra;
            return this;
        }

        public Builder withDA(double da) {
            this.da = da;
            return this;
        }

        public Builder withOtherAllowances(double otherAllowances) {
            this.otherAllowances = otherAllowances;
            return this;
        }

        public Builder withPF(double pf) {
            this.pf = pf;
            return this;
        }

        public Builder withESI(double esi) {
            this.esi = esi;
            return this;
        }

        public Builder withTax(double tax) {
            this.tax = tax;
            return this;
        }

        public Payslip build() {
            Payslip payslip = new Payslip();
            payslip.employeeName = this.employeeName;
            payslip.employeeId = this.employeeId;
            payslip.basicPay = this.basicPay;
            payslip.hra = this.hra;
            payslip.da = this.da;
            payslip.otherAllowances = this.otherAllowances;
            payslip.grossSalary = payslip.basicPay + payslip.hra + payslip.da + payslip.otherAllowances;
            payslip.pf = this.pf;
            payslip.esi = this.esi;
            payslip.tax = this.tax;
            payslip.deductions = payslip.pf + payslip.esi + payslip.tax;
            payslip.netSalary = payslip.grossSalary - payslip.deductions;
            return payslip;
        }
    }

    @Override
    public String toString() {
        return "Payslip : {" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", basicPay=" + basicPay +
                ", hra=" + hra +
                ", da=" + da +
                ", otherAllowances=" + otherAllowances +
                ", grossSalary=" + grossSalary +
                ", pf=" + pf +
                ", esi=" + esi +
                ", tax=" + tax +
                ", deductions=" + deductions +
                ", netSalary=" + netSalary +
                '}';
    }
}
