/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp11;

/**
 *
 * @author cusat
 */
public class InheritanceDemo {
    public static void main(String[] args) {
        Rectangle R=new Rectangle(10, 5);
        System.out.println("Peimeter "+R.getPerimeter());
        System.out.println("Area "+R.getArea());
        
        
        Box B = new Box(10, 5, 7);
        System.out.println("Peimeter "+B.getPerimeter());
        System.out.println("Area "+B.getArea());
        System.out.println("Volume : "+B.getVolume());
        
    }
}
class Rectangle{
    
    protected int length;
    protected int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    int getPerimeter()
    {
        return 2*(length+breadth);
    }
    int getArea()
    {
        return length*breadth;
    }
   
}

class Box extends Rectangle{
    
    private int height;

    public Box( int length, int breadth, int height) {
        super(length, breadth);
        this.height=height;
  
    }
    int getPerimeter()
    {
        return 4*(length+breadth+height);
    }
    
     int getArea()
    {
        return 2*(length*breadth+height*breadth+length*height);
    }
    int getVolume()
    {
        return 2*(length*breadth*height);
    }
    
}
