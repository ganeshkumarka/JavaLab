/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION1;

/**
 *
 * @author 
 */
public class TowerOfHanoi {

    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        } else {
            towerOfHanoi(n - 1, source, destination, auxiliary);
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            towerOfHanoi(n - 1, auxiliary, source, destination);
        }
    }

    public static void main(String[] args) {
        int numOfDisks = 5;
        towerOfHanoi(numOfDisks, 'A', 'B', 'C');
    }
}

