/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sync;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cusat
 */
public class Incrementer extends Thread{
    Counter ob = new Counter();
    public Incrementer(Counter ob){
        this.ob=ob;
    }

    Incrementer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void run(){
        while(true){
            try {
                ob.increment();
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Incrementer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
