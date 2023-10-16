/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp3;

/**
 *
 * @author cusat
 */

    public class Constructors {
    
    int a;
    boolean b;

    public Constructors() {
        a=5;
        b=true;
    }
    
    public Constructors(int a, boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public Constructors(int a){
        this.a = a;
    }
    
    public Constructors(boolean b) {
        this.b = b;
    }
    
    void print(){
        System.out.println("a = "+a+" b = "+b);
    }
}
