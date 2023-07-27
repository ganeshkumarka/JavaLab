/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION5;

/**
 *
 * @author cusat
 */
public class Box {
    private int length;
    private int  breadth;
    private int  height;
    private double area;
    private double volume;

    public Box(int side) {
        this.length = side;
        this.breadth = side;
        this.height = side;
        calculateArea();
        calculateVolume();
    }

    public Box(int side1, int side2) {
        this.length = side1;
        this.breadth = side2;
        this.height = side2;
        calculateArea();
        calculateVolume();
    }

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        calculateArea();
        calculateVolume();
    }

    private void calculateArea() {
        area = 2 * ((length * breadth) + (breadth * height) + (height * length));
    }

    private void calculateVolume() {
        volume = length * breadth * height;
    }

    public double getArea() {
        return area;
    }

    public double getVolume() {
        return volume;
    }
}
