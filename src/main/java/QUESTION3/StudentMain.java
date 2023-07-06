/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION3;

/**
 *
 * @author cusat
 */
public class StudentMain {
    public static void main(String[] args) {
         
        String name1 = "RAHUL";
        int[] subjectMarks1 = {80, 85, 90, 75, 95};
        Student student1 = new Student(name1, 1, subjectMarks1);

        String name2 = "ROHITH";
        int[] subjectMarks2 = {85, 90, 95, 80, 88};
        Student student2 = new Student(name2, 2, subjectMarks2);
        

        if (student1.getTotal() > student2.getTotal()) {
            System.out.println("Details of student with greater total marks:");
            student1.printDetails();
        } else if (student1.getTotal() < student2.getTotal()) {
            System.out.println("Details of student with greater total marks:");
            student2.printDetails();
        } else {
            System.out.println("Both students have the same total marks.");
        }
    }
}
