/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION8;

/**
 *
 * @author cusat
 */
interface _3DShapes {
    void printVolume();
    void printArea();
}

class Cylinder implements _3DShapes {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void printVolume() {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Cylinder Volume: " + volume);
    }

    @Override
    public void printArea() {
        double baseArea = Math.PI * Math.pow(radius, 2);
        double lateralArea = 2 * Math.PI * radius * height;
        double totalArea = (2 * baseArea) + lateralArea;
        System.out.println("Cylinder Surface Area: " + totalArea);
    }
}

class Sphere implements _3DShapes {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void printVolume() {
        double volume = (4 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Sphere Volume: " + volume);
    }

    @Override
    public void printArea() {
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println("Sphere Surface Area: " + surfaceArea);
    }
}

