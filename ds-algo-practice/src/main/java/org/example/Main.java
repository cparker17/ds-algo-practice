package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // ************LINKED LIST TESTS******************

        //APPEND AND PREPEND METHOD TESTS
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.prepend(0);

        //REMOVE LAST METHOD TEST
        System.out.println(myLinkedList.head.value + " " + myLinkedList.head.next.value + " "
                + myLinkedList.head.next.next.value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);

        //GET AND SET METHODS TEST
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        System.out.println(myLinkedList.get(0).value);
        System.out.println(myLinkedList.get(1).value);
        System.out.println(myLinkedList.get(2).value);
        System.out.println(myLinkedList.get(4).value);
        myLinkedList.set(0, 100);
        myLinkedList.set(2, 200);
        System.out.println(myLinkedList.get(0).value);
        System.out.println(myLinkedList.get(2).value);
        myLinkedList.insert(2, 500);
        myLinkedList.printValues();
        System.out.println("\n");
        myLinkedList.printValues();

        //REVERSE METHOD TEST
        myLinkedList.reverse();
        System.out.println("\n");
        myLinkedList.printValues();

        //   ********DOUBLY LINKED LIST TESTS**************

        //APPEND METHOD TEST
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList();
        myDoublyLinkedList.append(1);
        myDoublyLinkedList.append(2);
        myDoublyLinkedList.append(3);
        System.out.print("Doubly Linked List Values = ");
        myDoublyLinkedList.printValues();
        System.out.println("\nLength = " + myDoublyLinkedList.length());

        //PREPEND METHOD TEST
        myDoublyLinkedList.prepend(0);
        myDoublyLinkedList.prepend(-1);
        myDoublyLinkedList.prepend(-2);
        System.out.print("Doubly Linked List Values = ");
        myDoublyLinkedList.printValues();
        System.out.println("\nLength = " + myDoublyLinkedList.length());

        //REMOVE FIRST TEST
        System.out.println("Value of removed node: " + myDoublyLinkedList.removeFirst().value);
        System.out.println("Value of removed node: " + myDoublyLinkedList.removeFirst().value);

        //REMOVE LAST METHOD TEST
        System.out.println("Value of remove node: " + myDoublyLinkedList.removeLast().value);
        System.out.println("Value of remove node: " + myDoublyLinkedList.removeLast().value);

        //APPEND AND GET TEST
        myDoublyLinkedList.append(3);
        System.out.print("\nCurrent values: ");
        myDoublyLinkedList.printValues();
        System.out.println("\n");
        System.out.println("Value at index 0: " + myDoublyLinkedList.get(0).value);
        System.out.println("Value at index 1: " + myDoublyLinkedList.get(1).value);
        System.out.println("Value at index 2: " + myDoublyLinkedList.get(2).value);
        System.out.println("\n");

        //INSERT METHOD TEST
        myDoublyLinkedList.printValues();
        myDoublyLinkedList.insert(2, 2);
        System.out.println("\n");
        myDoublyLinkedList.printValues();
        System.out.println("\n");
        myDoublyLinkedList.insert(0, -1);
        myDoublyLinkedList.insert(5, 4);
        myDoublyLinkedList.printValues();

        //REMOVE METHOD TEST
        myDoublyLinkedList.remove(3);
        System.out.println("\n");
        myDoublyLinkedList.printValues();

        // ********STACK TESTS************

        Stack myStack = new Stack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println("\n");
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        // *******QUEUE TESTS***********

        Queue myQueue = new Queue();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());

        // *********HASH TABLE TESTS**********

        System.out.println();

        HashTable hashTable = new HashTable();

        //INSERT METHOD TEST
        hashTable.insert("desk", 20);
        hashTable.insert("computer", 5);
        hashTable.insert("lamp", 2);
        hashTable.insert("picture", 10);
        hashTable.insert("bookcase", 100);
        hashTable.insert("rug", 35);
        hashTable.printTableValues();

        System.out.println();

        //SEARCH METHOD TEST
        System.out.println(hashTable.search("desk", 20));
        System.out.println(hashTable.search("lamp", 2));
        System.out.println(hashTable.search("chair", 75));

        //DELETE METHOD TEST
        hashTable.delete("desk", 20);
        hashTable.delete("picture", 10);
        hashTable.delete("chair", 75);
        hashTable.printTableValues();
    }
}