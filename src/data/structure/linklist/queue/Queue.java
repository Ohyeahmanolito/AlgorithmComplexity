/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure.linklist.queue;

/**
 *
 * @author mvoctavianojr
 */
class Queue {

    QNode front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    // Method to add an key to the queue.   
    void enqueue(int key) {

        // Create a new LL node 
        QNode temp = new QNode(key);

        // If queue is empty, then new node is front and rear both 
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        // Add the new node at the end of queue and change rear 
        this.rear.next = temp;
        this.rear = temp;
    }

    // Method to remove an key from queue.   
    QNode dequeue() {
        // If queue is empty, return NULL. 
        if (this.front == null) {
            return null;
        }

        // Store previous front and move front one node ahead 
        QNode temp = this.front;
        this.front = this.front.next;

        // If front becomes NULL, then change rear also as NULL 
        if (this.front == null) {
            this.rear = null;
        }
        return temp;
    }
}
