/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp7;

/**
 *
 * @author cusat
 */
import java.util.Scanner;
class Matrix 
{
    int rows,column;
    int mat[][];

    public Matrix(int rows, int column,int mat[][]) {
        this.rows = rows;
        this.column = column;
        this.mat = new int[this.rows][this.column];
        for(int i=0;i<this.rows;i++)
        {
            for(int j=0;j<this.column;j++)
            {
                
                
                
                this.mat[i][j]=mat[i][j];
            }
        }
    }

    public Matrix(int rows, int column) {
        this.rows = rows;
        this.column = column;
        this.mat = new int[this.rows][this.column];
    }
    
    public void ReadMatrix()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<this.rows;i++)
        {
            for(int j=0;j<this.column;j++)
            {
                System.out.print("Enter element at ["+i+","+j+"] : ");
                this.mat[i][j] = sc.nextInt();
            }
        }
        
    }

    @Override
    public String toString() {
        
        String   out = "";
        for(int i=0;i<this.rows;i++)
        {
            for(int j=0;j<this.column;j++)
            {
                out = out +this.mat[i][j]+"    ";
            }
            out = out +"\n";
        }
                
        return out; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}


public class NDArray {

    public static void main(String[] args) {
        
    int[][] data = {{1,2,3},{4,5,6},{7,8,9}};
    Matrix m1 = new Matrix(3, 3,data);
    System.out.println(m1);
    
    
    Matrix m2 = new Matrix(2,2);
    m2.ReadMatrix();
    System.out.println(m2);
   
    }
    
}