/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question7;

/**
 *
 * @author ganes
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class CarAnimationApplet extends Applet implements ActionListener {
    private int carX, carY; // Car's current position
    private int carSpeed = 5; // Car's speed
    private Timer timer;
    private boolean isMoving = false;

    public void init() {
        carX = 0;
        carY = 100;

        // Create buttons
        Button startButton = new Button("Start");
        Button pauseButton = new Button("Pause");
        Button stopButton = new Button("Stop");

        // Add action listeners to buttons
        startButton.addActionListener(this);
        pauseButton.addActionListener(this);
        stopButton.addActionListener(this);

        // Add buttons to the applet
        add(startButton);
        add(pauseButton);
        add(stopButton);

        // Create and start the timer for animation
        timer = new Timer(100, this);
        timer.start();
    }

    public void paint(Graphics g) {
        // Draw the car
        g.setColor(Color.RED);
        g.fillRect(carX, carY, 60, 30);

        // Draw the road
        g.setColor(Color.GRAY);
        g.fillRect(0, 130, getWidth(), 50);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            if (isMoving) {
                carX += carSpeed;
                if (carX > getWidth()) {
                    carX = -60; // Reset car's position when it goes off the screen
                }
                repaint();
            }
        } else if (e.getActionCommand().equals("Start")) {
            isMoving = true;
        } else if (e.getActionCommand().equals("Pause")) {
            isMoving = false;
        } else if (e.getActionCommand().equals("Stop")) {
            isMoving = false;
            carX = 0; // Reset car's position
        }
    }
}
