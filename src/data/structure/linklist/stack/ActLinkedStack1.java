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
public class ActLinkedStack1<Item> implements Stack<Item> {

    private Node head; //the first node
    private int size; // number of items

    //nested class to define node
    private class Node {

        Item item;
        Node next;
    }

    //Zero argument constructor
    public ActLinkedStack1() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    //Remove item from the beginning of the list.
    public Item pop() {
        Item item = head.item;
        //TODO
        return item;
    }

    //Add item to the beginning of the list.
    public void push(Item item) {
        //TODO
    }

    public int size() {
        //TODO
        return 0;
    }

}
// https://docs.oracle.com/javase/tutorial/java/generics/types.html
