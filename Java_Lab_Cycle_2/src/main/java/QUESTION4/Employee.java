/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION4;

/**
 *
 * @author 
 */
//class Date{
//       int date;
//       int month;
//       int year;
//
//    public Date(int date, int month, int year) {
//        this.date = date;
//        this.month = month;
//        this.year = year;
//    }
//    public String toString() {
//        return date + "/" + month + "/" + year;
//    }
//}
class Employee {
    int id;
    String name;
    double salary;
    Date dob;
    Date doj;

    public Employee(int id, String name, Date dob, Date doj,double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dob = dob;
        this.doj = doj;
    }
    class Date{
       int date;
       int month;
       int year;

        public Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
        }
        public String toString() {
        return date + "/" + month + "/" + year;
        }
    }
    public double getSalary(){
        return salary;
    }
    public void display(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id); 
        System.out.print("Employee date of birth: "+dob+" ");
        System.out.print("Employee date of joining: "+doj+" ");
        System.out.println("Salary: "+salary+" ");
    }
}
