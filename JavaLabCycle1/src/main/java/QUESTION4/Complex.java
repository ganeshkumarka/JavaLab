/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION4;

/**
 *
 * @author cusat
 */
public class Complex {
    private double real;
    private double imaginary;

    public void initialize(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void printComplexNumber() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
