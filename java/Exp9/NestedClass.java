/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp9;

/**
 *
 * @author ganes
 */
public class NestedClass {
      public static void main(String[] args) {
        
        CPU cpu=new CPU();
        cpu.price = 25000;
        
        CPU.Processor processor = cpu.new Processor(4, "Intel");
        CPU.RAM ram = cpu.new RAM(512,"Segate");
        
        System.out.println(processor.getCache());
        System.out.println(ram.getSpeed());
        
        Motherboard.USB usb = new Motherboard.USB();
        System.out.println(usb.getTotalPorts());
        
    }
}
