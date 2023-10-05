/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationhardcodelinkedlists;

import static java.nio.file.Files.size;
import java.util.NoSuchElementException;

/**
 *
 * @author oz
 */
public class LinkedList {

    private int size;
    private int current;

    private class Node {
        private int value; // index[i]
        private Node next; //  address which make hooks up next address .

        // Constructor
        public Node(int value) {
            this.value = value;
        }

    }

    private Node first; //head
    private Node last; //tail

    // We dont need a setter becauase of below code .
    public void addLast(int item) {
        var node = new Node(item);
        if (first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        // baya sonra ekledik
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (first == null)
            first = last = node;
        else {
            first.next = node;
            first = node;
        }
        size++;
    }

    // make function if the empty

    private boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        int indexOf;
        return indexOf(item) != -1;
    }


    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }

        size--;
    }
 // dikkatli calis anlamadin
    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }

        size--;
    }
/// Dikkatli calis anlamadin onur
    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public int size(){
        return size;
    }

    // Converto regular array

    public int [] toArray(){
        int [] array = new int[size];
        var index=0;
        var current = first ;
        while(current !=null){
            array[index++]=current.value;
            current=current.next;
        }
        return array;
    }


    public void reverse() {
        if (isEmpty()) return;
        //[10 <- 20 <- 30]
        //              p    c     n
        // n=c.next;
        // c.next = p

        var previous = first;
        var current = first.next;
        // last field
        while (current != null) {
            var next = current.next; // we need to get refereces the next node current
            // change position
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;

    }

     // KTH Node From the End
     public int getKthFromTheEnd(int k) {
         if (isEmpty())
             throw new IllegalStateException();

         var a = first;
         var b = first;
         for (int i = 0; i < k - 1; i++) {
             b = b.next;
             if (b == null)
                 throw new IllegalArgumentException();
         }
         while (b != last) {
             a = a.next;
             b = b.next;
         }
         return a.value;
     }


}
