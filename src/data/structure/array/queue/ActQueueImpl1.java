/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure.array.queue;

/**
 *
 * @author mvoctavianojr
 */
public class ActQueueImpl1 {
     
    private int capacity;
    int queueArr[];
    int front = 0;
    int rear = -1;
    int currentSize = 0;
     
    public ActQueueImpl1(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }
 
    /**
     * this method adds element at the end of the queue.
     * @param item
     */
    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: "+item);
        } else {
            //TODO
        }
    }
 
    /**
     * this method removes an element from the top of the queue
     */
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            //TODO
        }
    }
 
    /**
     * This method checks whether the queue is full or not
     * @return boolean
     */
    public boolean isQueueFull(){
        boolean status = false;
       
        //TODO
        
        return status;
    }
     
    /**
     * This method checks whether the queue is empty or not
     * @return
     */
    public boolean isQueueEmpty(){
        boolean status = false;
        
        //TODO
        
        return status;
    }
     
    public static void main(String a[]){
         
        ActQueueImpl1 queue = new ActQueueImpl1(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
    }
}
