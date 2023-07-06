/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION1;

/**
 *
 * @author cusat
 */
public class PrimeNum {
    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        int count = 0;
        int number = 2;
        System.out.println("The first "+n+" prime numbers are: ");
        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    private static boolean isPrime(int number) {
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}


