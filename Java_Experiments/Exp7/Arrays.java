/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp7;

/**
 *
 * @author cusat
 */
public class Arrays {
     public static int max(int[] array){
        
        int m = array[0];
        for(int i=0;i<array.length;i++)
            if(m<array[i])
                m=array[i];
        return m;
        
    }
    
    public static int[] generateAP(int a,int d, int n){
        
        int seq[] =new int[n];
        seq[0] = a;
        for(int i=1;i<n;i++)
        {
            seq[i]=seq[i-1]+d;
        }
        return seq;
        
    }
    
    
    
    public static void main(String[] args) {
        
        int a[] = new int[5];
        int[] b = new int[5];
        int []c = new int[5];  
        
        for(int i=0;i<5;i++)
        {
            a[i]=i;
            b[i]=2*i;
            c[i]=a[i]+b[i];
        }
        
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]+"\t"+b[i]+"\t"+c[i]);
        }
        
        System.out.println(Arrays.max(b));
        
        c = Arrays.generateAP(2,7,10);
        
        for(int i=0;i<c.length;i++)
            System.out.print(c[i]+" ");//print
        
    }
}
