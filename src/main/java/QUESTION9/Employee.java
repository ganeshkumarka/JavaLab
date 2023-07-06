/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION9;

/**
 *
 * @author cusat
 */
class Employee {
    protected String name;
    protected int code;
    protected double basicPay;

    public Employee(String name, int code, double basicPay) {
        this.name = name;
        this.code = code;
        this.basicPay = basicPay;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee Code: " + code);
        System.out.println("Basic Pay: " + basicPay);
    }
}

interface Salary {
    double calculateSalary();
}

class SalarySlip extends Employee implements Salary {
    public SalarySlip(String name, int code, double basicPay) {
        super(name, code, basicPay);
    }

    @Override
    public double calculateSalary() {
        double netSalary = basicPay - (0.1 * basicPay); // 10% deduction for taxes
        return netSalary;
    }

    public void printSalarySlip() {
        System.out.println("------- Salary Slip -------");
        printInfo();
        System.out.println("Net Salary: " + calculateSalary());
    }
}
