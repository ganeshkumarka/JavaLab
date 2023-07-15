/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp4;

/**
 *
 * @author cusat
 */

public class StaticsMain {
    
    public static void main(String[] args) {
        
        Statics ob=new Statics(2);
        ob.printValues();
        Statics.setB(5);
        ob.printValues();
        
        Statics obj=new Statics(3);
        obj.printValues();
        Statics.setB(10);
        obj.printValues();
        
        ob.printValues();
        
        
    }
}
