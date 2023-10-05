/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationhardcodelinkedlists;

import java.util.Arrays;


/**
 *
 * @author oz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      LinkedList list = new LinkedList();
         //java.util.LinkedList list = new java.util.LinkedList();

        list.addLast(10);
        System.out.println(list.size());
        list.addLast(20);
        System.out.println(list.size());
        list.addLast(30);
      list.addLast(40);
      list.addLast(50);
      System.out.println(list.getKthFromTheEnd(9));
        //list.reverse();
        System.out.println(list.size());
      // list.removeFirst();
      //  list.removeLast();
        System.out.println(list.size());
        System.out.println(list.indexOf(50));
        System.out.println(list.contains(20));
        // Converting ListArray to regular array .
        var array =list.toArray();
        System.out.println(Arrays.toString(array));




        
        

    }
    
}
