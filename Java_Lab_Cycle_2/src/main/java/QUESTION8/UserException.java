/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION8;

/**
 *
 * @author cusat
 */
//public class UserException extends Exception{

    /**
     * @param args the command line arguments
     */
public class UserException extends Exception{

    /**
     * @param args the command line arguments
     */
    public UserException(String str)
    {
        super(str);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            throw new UserException("This is user exception ");
        }
        catch(UserException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
}