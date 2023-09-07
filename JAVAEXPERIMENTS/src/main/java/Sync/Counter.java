/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sync;

/**
 *
 * @author cusat
 */
public class Counter {
    private int limit;
    private int count;

    public Counter(int limit) {
        this.limit = limit;
        this.count=0;
    }

    Counter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void increment(){
        if(count>=limit){
            System.out.println("limt reached,waiting for decrement");     
        }     
        else{
            count++;
            System.out.println("Current count incremented as "+count);
        }
    }
    public void decrement(){
        if(count<=0){
            System.out.println("count reached 0,waiting for increment");     
        }     
        else{
            count--;
            System.out.println("Current count decremented as "+count);
        }
    }
    
}
