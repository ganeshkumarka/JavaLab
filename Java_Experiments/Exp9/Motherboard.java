/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp9;

/**
 *
 * @author cusat
 */
public class Motherboard {
    
    static class USB{
        
        int usb2=2;
        int usb3=1;
        
        int getTotalPorts()
        {
            return usb2+usb3;
        }
    }
    
}