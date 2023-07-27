/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION6;

/**
 *
 * @author cusat
 */
public class BoxMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rectangle.getArea());

        Box box = new Box(4, 6, 2);
        System.out.println("Box Area: " + box.getArea());
        System.out.println("Box Volume: " + box.getVolume());
    }
}
