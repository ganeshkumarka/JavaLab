/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sync;

/**
 *
 * @author cusat
 */
public class CounterMain {
    public static void main(String[] args) {
        Counter obj = new Counter(10);
        Incrementer iob = new Incrementer(obj);
        Decrementer dob = new Decrementer(obj); 
        iob.start();
        dob.start();
    }
}
