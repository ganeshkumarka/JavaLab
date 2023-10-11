/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp8;

/**
 *
 * @author cusat
 */
public class Recursion {
    
    static void fun(int N)
    {
        if(N>0){
            System.out.println("Hello");
            fun(N-1);
        }
    }
    
    public static void main(String[] args) {
        
        fun(10);
    }
    
}