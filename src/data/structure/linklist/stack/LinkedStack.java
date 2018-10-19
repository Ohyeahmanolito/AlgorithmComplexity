/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure.linklist.stack;

/**
 *
 * @author mvoctavianojr
 */
public class LinkedStack<Item> implements Stack<Item> {

    private Node head; //the first node
    private int size; // number of items

    //nested class to define node
    private class Node {

        Item item;
        Node next;
    }

    //Zero argument constructor
    public LinkedStack() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    //Remove item from the beginning of the list.
    public Item pop() {
        Item item = head.item;
        head = head.next;
        size--;
        return item;
    }

    //Add item to the beginning of the list.
    public void push(Item item) {
        Node oldHead = head;
        head = new Node();
        head.item = item;
        head.next = oldHead;
        size++;
    }

    public int size() {
        return size;
    }

}
// https://docs.oracle.com/javase/tutorial/java/generics/types.html