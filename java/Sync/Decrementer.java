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
public class Decrementer extends Thread{
    Counter ob;

    public Decrementer(Counter ob) {
        this.ob = ob;
    }
    @Override
    public void run(){
        try {
            ob.decrement();
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Decrementer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
