/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp11;

/**
 *
 * @author cusat
 */
public class FinalUsage {
      public static void main(String[] args) {
        
        final double pie = 3.14;
        System.out.println("Pie : "+pie);
        //pie = 3.41; make an error
        System.out.println("Pie : "+pie);
        
    }
}

class Simple{

    final public void greet()
    {
            System.out.println("Good Morning !");
    }
}
final class Complex extends Simple{
   
    //public void greet(){} cannot overide a final method 
    
    public void greetings()
    {
        System.out.println("Hello! How are you ?");
    }
    
}
