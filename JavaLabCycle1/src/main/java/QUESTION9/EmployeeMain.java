/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION9;

/**
 *
 * @author cusat
 */
public class EmployeeMain {
    public static void main(String[] args) {
        SalarySlip employee1 = new SalarySlip("DEEPAK", 123, 50000.0);
        employee1.printSalarySlip();

        System.out.println();

        SalarySlip employee2 = new SalarySlip("ROHAN", 456, 75000.0);
        employee2.printSalarySlip();
    }
}
