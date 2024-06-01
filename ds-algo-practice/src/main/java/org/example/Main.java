package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.prepend(0);

        System.out.println(myLinkedList.head.value + " " + myLinkedList.head.next.value + " "
                + myLinkedList.head.next.next.value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
    }
}