/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author cusat
 */
public class Collection {
    public static void main(String[] args) {
        int []x = {1,2,3};
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
//        for(Integer y: mylist){
//            System.out.println(y);
//        }
        for(Iterator it = mylist.iterator();it.hasNext();){
            System.out.println(it.next());
        }
        mylist.add(2,4);
        for(Iterator it = mylist.iterator();it.hasNext();){
            System.out.println(it.next());
        }
        mylist.sort(Comparator.naturalOrder());
        for(Iterator it = mylist.iterator();it.hasNext();){
            System.out.println(it.next());
        }
        mylist.sort(Comparator.reverseOrder());
        for(Iterator it = mylist.iterator();it.hasNext();){
            System.out.println(it.next());
        }
        mylist.remove(0);
         for(Iterator it = mylist.iterator();it.hasNext();){
            System.out.println(it.next());
        }
    }
}
