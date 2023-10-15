/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question8;

/**
 *
 * @author ganes
 */
import java.applet.*;
import java.awt.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class AnalogClockApplet extends Applet implements Runnable {
    private Thread clockThread;
    private int centerX, centerY;
    private int radius;
    private Date startTime;

    public void init() {
        // Get the starting time as a parameter in the format "HH:mm:ss"
        String startTimeStr = getParameter("startTime");

        if (startTimeStr == null) {
            startTimeStr = "00:00:00"; // Default time if not provided
        }

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        try {
            startTime = sdf.parse(startTimeStr);
        } catch (Exception e) {
            startTime = new Date();
        }

        centerX = getWidth() / 2;
        centerY = getHeight() / 2;
        radius = Math.min(centerX, centerY) - 10;

        clockThread = new Thread(this);
        clockThread.start();
    }

    public void paint(Graphics g) {
        drawClock(g);
    }

    public void update(Graphics g) {
        drawClock(g);
    }

    public void drawClock(Graphics g) {
        // Clear the background
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Draw clock face
        g.setColor(Color.black);
        g.drawOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);

        // Calculate time
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startTime);
        calendar.add(Calendar.SECOND, (int) ((System.currentTimeMillis() - getStartingTime()) / 1000));

        int hours = calendar.get(Calendar.HOUR);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);

        // Draw clock hands
        drawHand(g, centerX, centerY, radius - 20, 360 - (hours % 12) * 30 - minutes / 2);
        drawHand(g, centerX, centerY, radius - 10, 360 - minutes * 6 - seconds / 10);
        drawHand(g, centerX, centerY, radius - 5, 360 - seconds * 6);

        // Draw clock center
        g.setColor(Color.black);
        g.fillOval(centerX - 3, centerY - 3, 6, 6);
    }

    private void drawHand(Graphics g, int x, int y, int len, double angle) {
        double radians = Math.toRadians(angle);
        int x2 = (int) (x + len * Math.cos(radians));
        int y2 = (int) (y - len * Math.sin(radians));
        g.drawLine(x, y, x2, y2);
    }

    public long getStartingTime() {
        return startTime.getTime();
    }

    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(1000); // Update every second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
