/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION6;

/**
 *
 * @author cusat
 */
public class Rectangle {
    protected double length;
    protected double breadth;
    protected double area;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        calculateArea();
    }

    protected void calculateArea() {
        area = length * breadth;
    }

    public double getArea() {
        return area;
    }
}
class Box extends Rectangle {
    private double height;
    private double volume;

    public Box(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
        calculateVolume();
    }

    private void calculateVolume() {
        volume = length * breadth * height;
    }

    public double getVolume() {
        return volume;
    }
}