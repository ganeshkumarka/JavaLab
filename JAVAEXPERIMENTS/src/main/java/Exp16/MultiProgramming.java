/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp16;

/**
 *
 * @author cusat
 */
public class MultiProgramming {
    public static void main(String[] args) throws InterruptedException {
        SampleThread t = new SampleThread();
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
//        RunnableThread r = new RunnableThread();
//        Thread tr = new Thread();
        Thread tr = new Thread (new RunnableThread());
        tr.start();
        tr.setPriority(Thread.MIN_PRIORITY);
        for (int i=0;i<100;i++){
            System.out.println("From Main"+i);
            Thread.sleep(20);
        }
       
        //t.stop();
    }
}
