/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp17;

/**
 *
 * @author cusat
 */
public class VariableArguments {
    public static int sum(int...a){
        int sum = 0;
        for(int i =0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int s;
        s=sum(1,2);
        System.out.println("sum: "+s);
        s=sum(1,2,3);
        System.out.println("sum: "+s);
        s=sum(1,2,3,4);
        System.out.println("sum: "+s);
    }
}
