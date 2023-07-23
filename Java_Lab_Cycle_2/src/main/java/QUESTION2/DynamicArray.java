/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION2;

/**
 *
 * @author amju
 */
public class DynamicArray {
    private int[] array;
    private int size;
    private int capacity;

    public DynamicArray() {
        this.capacity = 10; // Initial capacity, you can change it as needed.
        this.array = new int[capacity];
        this.size = 0;
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.size = 0;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void addElement(int element) {
        if (size == capacity) {
            resizeArray();
        }
        array[size] = element;
        size++;
    }

    public void addElement(int element, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position. Element not added.");
            return;
        }

        if (size == capacity) {
            resizeArray();
        }

        for (int i = size; i > position; i--) {
            array[i] = array[i - 1];
        }
        array[position] = element;
        size++;
    }

    public void removeElement(int element) {
        int index = searchElement(element);
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        } else {
            System.out.println("Element not found. Nothing removed.");
        }
    }

    public int searchElement(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    private void resizeArray() {
        capacity *= 2;
        int[] newArray = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}

