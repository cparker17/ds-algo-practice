package org.example;

public class Main {
    public static void main(String[] args) {
//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);
//        myLinkedList.prepend(0);
//
//        System.out.println(myLinkedList.head.value + " " + myLinkedList.head.next.value + " "
//                + myLinkedList.head.next.next.value);
////        System.out.println(myLinkedList.removeLast().value);
////        System.out.println(myLinkedList.removeLast().value);
//
//        System.out.println(myLinkedList.get(0).value);
//        System.out.println(myLinkedList.get(1).value);
//        System.out.println(myLinkedList.get(2).value);
//        //System.out.println(myLinkedList.get(4).value);
////        myLinkedList.set(0, 100);
////        myLinkedList.set(2, 200);
////        System.out.println(myLinkedList.get(0).value);
////        System.out.println(myLinkedList.get(2).value);
//        myLinkedList.insert(2, 500);
//        myLinkedList.printValues();
//        System.out.println("\n");
//        myLinkedList.printValues();
//        myLinkedList.reverse();
//        System.out.println("\n");
//        myLinkedList.printValues();

        //DOUBLY LINKED LIST TESTS
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList();
        myDoublyLinkedList.append(1);
        myDoublyLinkedList.append(2);
        myDoublyLinkedList.append(3);
        System.out.print("Doubly Linked List Values = ");
        myDoublyLinkedList.printValues();
        System.out.println("\nLength = " + myDoublyLinkedList.length());

        myDoublyLinkedList.prepend(0);
        myDoublyLinkedList.prepend(-1);
        myDoublyLinkedList.prepend(-2);
        System.out.print("Doubly Linked List Values = ");
        myDoublyLinkedList.printValues();
        System.out.println("\nLength = " + myDoublyLinkedList.length());

        System.out.println("Value of removed node: " + myDoublyLinkedList.removeFirst().value);
        System.out.println("Value of removed node: " + myDoublyLinkedList.removeFirst().value);

        System.out.println("Value of remove node: " + myDoublyLinkedList.removeLast().value);
        System.out.println("Value of remove node: " + myDoublyLinkedList.removeLast().value);

        myDoublyLinkedList.append(3);
        System.out.print("\nCurrent values: ");
        myDoublyLinkedList.printValues();
        System.out.println("\n");
        System.out.println("Value at index 0: " + myDoublyLinkedList.get(0).value);
        System.out.println("Value at index 1: " + myDoublyLinkedList.get(1).value);
        System.out.println("Value at index 2: " + myDoublyLinkedList.get(2).value);
        System.out.println("\n");



    }
}