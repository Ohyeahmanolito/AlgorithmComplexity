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
public interface Stack<Item> {

    Item pop(); // return the top item and removes it from stack

    void push(Item item); // adds an item to the stack

    boolean isEmpty(); // returns true if stack is empty, false otherwise

    int size();  // returns the number of items in stack right now
}
