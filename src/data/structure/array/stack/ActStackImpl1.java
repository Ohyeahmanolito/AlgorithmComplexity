/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure.array.stack;

/**
 *
 * @author mvoctavianojr
 */
public class ActStackImpl1 {

    private int stackSize;
    private int[] stackArr;
    private int top;

    /**
     * constructor to create stack with size
     *
     * @param size
     */
    public ActStackImpl1(int size) {
        this.stackSize = size;
        this.stackArr = new int[stackSize];
        this.top = -1;
    }

    /**
     * This method adds new entry to the top of the stack
     *
     * @param entry
     * @throws Exception
     */
    public void push(int entry) throws Exception {
        //TODO
    }

    /**
     * This method removes an entry from the top of the stack.
     *
     * @return
     * @throws Exception
     */
    public int pop() throws Exception {
        if (this.isStackEmpty()) {
            throw new Exception("Stack is empty. Can not remove element.");
        }
        //TODO
        int entry = 0;
        return entry;
    }

    /**
     * This method returns top of the stack without removing it.
     *
     * @return
     */
    public int peek() {
        //TODO
        return 0;
    }

    /**
     * This method returns true if the stack is empty
     *
     * @return
     */
    public boolean isStackEmpty() {
        //TODO
        return false;
    }

    /**
     * This method returns true if the stack is full
     *
     * @return
     */
    public boolean isStackFull() {
        //TODO
        return false;
    }

    public static void main(String[] args) {
        ActStackImpl1 stack = new ActStackImpl1(5);
        try {
            stack.push(4);
            stack.push(8);
            stack.push(3);
            stack.push(89);
            stack.pop();
            stack.push(34);
            stack.push(45);
            stack.push(78);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
