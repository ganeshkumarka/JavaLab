/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp2;

/**
 *
 * @author cusat
 */
public class AdderMain {
    public static void main(String[] args) {
        
        Adder ob1 = new Adder(10, 5);
        ob1.add();
        System.out.println(ob1.getX()+" + "+ob1.getY()+" = "+ob1.getSum());
        
        ob1.setX(20);
        ob1.setY(30);
        ob1.add();
        System.out.println(ob1.getX()+" + "+ob1.getY()+" = "+ob1.getSum());
        
                
        
    }
    
}
