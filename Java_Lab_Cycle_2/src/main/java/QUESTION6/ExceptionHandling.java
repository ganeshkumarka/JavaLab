/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION6;

/**
 *
 * @author cusat
 */
public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            String numstr = "123abc";
            int num = Integer.parseInt(numstr);
            System.out.println("number: "+num);
        }
        catch(NumberFormatException e){
            System.out.println("Number format exception occured");
        }
        try{
            String str = "hello";
            System.out.println("length of the string: "+str.length());
        }
        catch(NullPointerException e){
            System.out.println("Null pointer exception occured.");
        }
    }
}
