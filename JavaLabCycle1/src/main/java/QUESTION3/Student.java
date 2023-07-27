/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION3;

/**
 *
 * @author cusat
 */
public class Student {
    private String name;
    private int rollNumber;
    private int[] subjectMarks;
    private int total;

    public Student(String name, int rollNumber, int[] subjectMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjectMarks = subjectMarks;
         TotalMarks();
    }

    
 

    private void TotalMarks() {
        int sum = 0;
        for (int marks : subjectMarks) {
            sum += marks;
        }
        total = sum;
    }

    public int getTotal() {
        
        return total;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + total);
    }
}
