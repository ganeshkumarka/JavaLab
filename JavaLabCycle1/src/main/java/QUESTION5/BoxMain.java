/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION5;

/**
 *
 * @author cusat
 */
public class BoxMain {
    public static void main(String[] args) {
        Box cube = new Box(5);
        System.out.println("Cube Area: " + cube.getArea());
        System.out.println("Cube Volume: " + cube.getVolume());

        Box squarePrism = new Box(4, 6);
        System.out.println("Square Prism Area: " + squarePrism.getArea());
        System.out.println("Square Prism Volume: " + squarePrism.getVolume());

        Box rectangularPrism = new Box(3, 5, 8);
        System.out.println("Rectangular Prism Area: " + rectangularPrism.getArea());
        System.out.println("Rectangular Prism Volume: " + rectangularPrism.getVolume());
    }
}
