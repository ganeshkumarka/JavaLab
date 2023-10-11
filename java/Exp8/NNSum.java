/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp8;

/**
 *
 * @author cusat
 */
public class NNSum {
    
    
    static int sum(int n)
    {
        if(n==1)
            return 1;
        else
            return n+sum(n-1);
    }
    
    public static void main(String[] args) {
        
        System.out.println("S(10) = "+NNSum.sum(10));
    }
    
    
}