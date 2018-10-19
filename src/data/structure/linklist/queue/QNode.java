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
class QNode {

    int key;
    QNode next;

    // constructor to create a new linked list node 
    public QNode(int key) {
        this.key = key;
        this.next = null;
    }
}
