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
class EmployeeList {
    int count;
    Employee[] employeeArray ;

    public EmployeeList(int count) {
        this.count = count;
        employeeArray = new Employee[count];
        
    }
    
    public void readEmployeeDetails() {
        
        //Employee[] employeeArray = new Employee[count];
        
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < count; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int empId = scanner.nextInt();

            System.out.print("Employee Name: ");
            scanner.nextLine(); // Consume the newline character
            String empName = scanner.nextLine();

            System.out.println("Enter Date of Birth (dd mm yyyy): ");
            int day = scanner.nextInt();
            int month = scanner.nextInt();
            int year = scanner.nextInt();
            Date dob = new Date(day, month, year);

            System.out.println("Enter Date of Joining (dd mm yyyy): ");
            day = scanner.nextInt();
            month = scanner.nextInt();
            year = scanner.nextInt();
            Date doj = new Date(day, month, year);

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            
            //Employee emp = new Employee(empId, empName, dob, doj, salary);
            //Employee emp = new Employee(empId, empName, dob, doj, salary);
            
            employeeArray[i] = new Employee(empId, empName, dob, doj, salary);
           
        }
        
    }
    public void sort() {
        
        for (int i = 1; i < count; i++) {
            Employee key = employeeArray[i];
            int j = i - 1;
            while (j >= 0 && key.getSalary()>employeeArray[j].getSalary()) {
                employeeArray[j + 1] = employeeArray[j];
                j = j - 1;
            }
            employeeArray[j + 1] = key;
        
        }
    }
    public void display(){
        for (int i=0;i<count;i++){
            employeeArray[i].display();
        }
    } 
}