/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp6.pkg1;

/**
 *
 * @author cusat
 */
public class AccessSpecifiersSubClass extends AccessSpecifiers {
      public AccessSpecifiersSubClass(int a, int b, int c, int d) {
        super(a, b, c, d);
    }
    
    public void print(){
        System.out.println(a+"->"+b+"->"+d);//default, public and protected are accessible in another class within the same package,
    }
    
    public static void main(String[] args) {
        AccessSpecifiersSubClass obj=new AccessSpecifiersSubClass(1, 2, 3, 4);
        obj.print();
    }
    
}
