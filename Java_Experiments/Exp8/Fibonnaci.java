/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp8;

/**
 *
 * @author cusat
 */
public class Fibonnaci {
    
    static int fib(int n)
    {
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
            
    }
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            System.out.print(fib(i)+" ");
        }
    }
    
}