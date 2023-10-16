/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp6.pkg1;

/**
 *
 * @author cusat
 */
public class AccessSpecifiers {
       int a; //default
    public int b; //public
    private int c; //private
    protected int d; //protected

    public AccessSpecifiers(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return a+"->"+b+"->"+c+"->"+d; //To change body of generated methods, choose Tools | Templates.
    }
    
}
