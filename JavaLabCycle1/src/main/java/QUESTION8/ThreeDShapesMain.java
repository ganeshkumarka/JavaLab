/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION8;

/**
 *
 * @author cusat
 */
public class ThreeDShapesMain {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3.5, 5.2);
        System.out.println("Calculating Cylinder Volume and Surface Area:");
        cylinder.printVolume();
        cylinder.printArea();

        System.out.println();

        Sphere sphere = new Sphere(2.8);
        System.out.println("Calculating Sphere Volume and Surface Area:");
        sphere.printVolume();
        sphere.printArea();
    }
}
