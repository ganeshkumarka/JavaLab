/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp4;

/**
 *
 * @author cusat
 */
public class Statics {
     int a;
    static int b;

    public Statics(int a) {
        this.a = a;
    }

    public static void setB(int x) {
        b=x;
    }
    
    void printValues()
    {
        System.out.println("a = "+a+" b = "+b);
    }
}
