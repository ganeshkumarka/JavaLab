/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp6.pkg1;

/**
 *
 * @author cusat
 */
public class AccessSpecifiersMain {
     public static void main(String[] args) {
        
        AccessSpecifiers ob=new AccessSpecifiers(1, 2, 3, 4);
        System.out.println(ob);
        System.out.println(ob.a+" "+ob.b+" "+ob.d);//default, public and protected are accessible in another class within the same package,
    }
    
}
