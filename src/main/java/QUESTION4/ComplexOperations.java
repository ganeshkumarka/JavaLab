/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION4;

/**
 *
 * @author cusat
 */
public class ComplexOperations {
    public static Complex add(Complex num1, Complex num2) {
        Complex result = new Complex();
        double realPart = num1.getReal() + num2.getReal();
        double imaginaryPart = num1.getImaginary() + num2.getImaginary();
        result.initialize(realPart, imaginaryPart);
        return result;
    }

    public static Complex multiply(Complex num1, Complex num2) {
        Complex result = new Complex();
        double realPart = (num1.getReal() * num2.getReal()) - (num1.getImaginary() * num2.getImaginary());
        double imaginaryPart = (num1.getReal() * num2.getImaginary()) + (num1.getImaginary() * num2.getReal());
        result.initialize(realPart, imaginaryPart);
        return result;
    }

    public static double getModulus(Complex num) {
        double realSquared = Math.pow(num.getReal(), 2);
        double imaginarySquared = Math.pow(num.getImaginary(), 2);
        return Math.sqrt(realSquared + imaginarySquared);
    }
}
