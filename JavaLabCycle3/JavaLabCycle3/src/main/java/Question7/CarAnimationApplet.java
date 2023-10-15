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

import java.applet.Applet;
import java.awt.event.*;

public class CarAnimationApplet extends Applet implements ActionListener, Runnable {
    private int carX;
    private int speed;
    private Thread carThread;
    private boolean isRunning = false;
    private Button startButton, pauseButton, stopButton;

    public void init() {
        carX = 0;
        speed = 5;

        startButton = new Button("Start");
        pauseButton = new Button("Pause");
        stopButton = new Button("Stop");

        startButton.addActionListener(this);
        pauseButton.addActionListener(this);
        stopButton.addActionListener(this);

        add(startButton);
        add(pauseButton);
        add(stopButton);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if ("Start".equals(command)) {
            if (!isRunning) {
                isRunning = true;
                carThread = new Thread(this);
                carThread.start();
            }
        } else if ("Pause".equals(command)) {
            isRunning = false;
        } else if ("Stop".equals(command)) {
            isRunning = false;
            carX = 0;
            repaint();
        }
    }

    public void run() {
        while (isRunning) {
            carX += speed;
            if (carX > getWidth()) {
                carX = -50;
            }
            repaint();

            try {
                Thread.sleep(50); // Adjust this value for car speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(0, 100, getWidth(), 50);
        g.setColor(Color.blue);
        g.fillOval(carX, 120, 20, 20);
        g.setColor(Color.black);
        g.fillOval(carX + 5, 140, 10, 10);
    }
}