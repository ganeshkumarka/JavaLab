/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp14;

/**
 *
 * @author cusat
 */
class FinalizeMethod {
    int a,b,c;

    public FinalizeMethod(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void printProduct(){
        System.out.println("product: "+(a*b*c));
    }
    public void finalize(){
        System.out.println("garbage collected");
    }
}

