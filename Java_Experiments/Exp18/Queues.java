/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exp18;

//import java.util.ArrayDeque;
import java.util.*;
//import java.util.PriorityQueue;

/**
 *
 * @author cusat
 */
public class Queues {
    public static void main(String[] args) {
       // LinkedList list = new LinkedList();
       ArrayDeque list = new ArrayDeque();
        list.add(1);
        list.add("xyz");
        list.addFirst(100);
        list.addLast(999);
        for(Object x: list)
        {
            System.out.println(x);
        }
        
        PriorityQueue queue = new PriorityQueue();
        
        queue.add(3);
        queue.add(1);
        queue.add(2);
        
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
    }
}
