/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question7;

/**
 *
 * @author ganes
 */
import java.applet.Applet;
import java.awt.Frame;

public class CarAnimationMain {
    public static void main(String[] args) {
        Frame frame = new Frame("Car Animation Applet");
        CarAnimationApplet carApplet = new CarAnimationApplet();

        frame.add("Center", carApplet);
        frame.resize(400, 200);
        frame.show();

        carApplet.init();
        carApplet.start();
    }
}