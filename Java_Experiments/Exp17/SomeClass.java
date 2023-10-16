/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp17;

/**
 *
 * @author cusat
 */
public class SomeClass {
    
    public static void increment(Integer n){
        
        n=n+1;   
        int x= n.intValue();
        System.out.println(n);
        x++;
        System.out.println(x);
        //n.valueOf(x);
        //System.out.println(n);
        Integer I = new Integer(x);
        System.out.println(I);
    }
    public static void main(String[] args) {
        int i=5;
        Integer I = new Integer(i);
        System.out.println("i before increment: "+I);
        increment(I);
        System.out.println("i after increment: "+I);
        
    }
}
