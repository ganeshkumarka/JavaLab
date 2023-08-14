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
            
            System.out.println("Enter your date of birth (dd/mm/yyyy): " );
            int day1 = scanner.nextInt();
            int month1 = scanner.nextInt();
            int year1 = scanner.nextInt();
            Employee.Date dob = new Employee.Date(day1,month1,year1);
            
            System.out.println("Enter your date of joining(dd/mm/yyyy): " );
            int day2 = scanner.nextInt();
            int month2 = scanner.nextInt();
            int year2 = scanner.nextInt();
            Employee.Date doj = new Employee.Date(day2,month2,year2);
//            Employee.Date date = new Employee.Date();
//            String dob = date.getDOB(); 
//                       
//            String doj = date.getDOJ(); 
            
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