/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp7;

/**
 *
 * @author cusat
 */
import java.util.Random;
class Box{
    int l,b,h;

    public Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
    public int getVolume()
    {
        return this.l*this.b*this.h;
    }
}

public class ObjectArray {
    
    public static void main(String[] args) {
        
        Random random = new Random(); 
        Box[] boxes = new Box[10];
        for(int i=0;i<10;i++)
            boxes[i] = new Box(random.nextInt(),random.nextInt(),random.nextInt());
        
        int max_vol=-1;
        int max_idx = -1;
        for(int i=0;i<10;i++){
            if(max_vol<boxes[i].getVolume()){
                
                max_vol = boxes[i].getVolume();
                max_idx = i;
            }
        }
        
        System.out.println("Max volume is for Box No :"+max_idx+"with volume : "+max_vol);
   
    }
    
}