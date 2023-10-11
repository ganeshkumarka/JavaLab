/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp15;

/**
 *
 * @author cusat
 */
public class Division {
    public static void main(String[] args )throws ArithmeticException,ArrayIndexOutOfBoundsException {
        int x,y;
        x=5;
        y=3;
        try {
            System.out.println("x/y = "+(x/y));
            int a[] = new int[10];
            for(int i=0;i<12;i++){
                a[i]=i+1;
            }
        }
        catch( ArithmeticException Ex){
            System.out.println("fill the value of y");
        }
        catch(ArrayIndexOutOfBoundsException Ex){
            System.out.println("Array out of index");
        }
        finally{
            System.out.println(" no exception");
        }
        
    
    }
}
