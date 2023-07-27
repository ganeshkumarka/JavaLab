/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION4;

/**
 *
 * @author cusat
 */
public class ComplexMain {
     public static void main(String[] args) {
        Complex complex1 = new Complex();
        complex1.initialize(3, 2);

        Complex complex2 = new Complex();
        complex2.initialize(1, -1);

        Complex sum = ComplexOperations.add(complex1, complex2);
        System.out.print("Sum: ");
        sum.printComplexNumber();

        Complex product = ComplexOperations.multiply(complex1, complex2);
        System.out.print("Product: ");
        product.printComplexNumber();

        double modulus1 = ComplexOperations.getModulus(complex1);
        System.out.println("Modulus of complex1: " + modulus1);
        
        double modulus2 = ComplexOperations.getModulus(complex2);
        System.out.println("Modulus of complex2: " + modulus2);
    }
}
