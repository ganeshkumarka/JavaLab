/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION2;

/**
 *
 * @author 
 */
import java.util.Scanner;
public class DynamicArrayInput {
     
        public void read(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial capacity of the dynamic array: ");
        int capacity = scanner.nextInt();

        DynamicArray dynamicArray = new DynamicArray(capacity);

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add an element");
            System.out.println("2. Add an element at a specific position");
            System.out.println("3. Remove an element");
            System.out.println("4. Search for an element");
            System.out.println("5. Print the array");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    int element = scanner.nextInt();
                    dynamicArray.addElement(element);
                    break;
                case 2:
                    System.out.print("Enter the element to add: ");
                    int elementToAdd = scanner.nextInt();
                    System.out.print("Enter the position to add at: ");
                    int position = scanner.nextInt();
                    dynamicArray.addElement(elementToAdd, position);
                    break;
                case 3:
                    System.out.print("Enter the element to remove: ");
                    int elementToRemove = scanner.nextInt();
                    dynamicArray.removeElement(elementToRemove);
                    break;
                case 4:
                    System.out.print("Enter the element to search: ");
                    int elementToSearch = scanner.nextInt();
                    int index = dynamicArray.searchElement(elementToSearch);
                    if (index != -1) {
                        System.out.println("Element found at index: " + index);
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;
                case 5:
                    System.out.println("Array elements:");
                    dynamicArray.printArray();
                    break;
                case 6:
                    System.out.println("Exited Successfully");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
