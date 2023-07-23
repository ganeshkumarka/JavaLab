/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION4;

/**
 *
 * @author 
 */
import java.util.Scanner;
public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        EmployeeList elist = new  EmployeeList(n);
        elist.readEmployeeDetails();
        elist.sort();
        elist.display();
    }
}
