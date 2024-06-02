package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.prepend(0);

        System.out.println(myLinkedList.head.value + " " + myLinkedList.head.next.value + " "
                + myLinkedList.head.next.next.value);
//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast().value);

        System.out.println(myLinkedList.get(0).value);
        System.out.println(myLinkedList.get(1).value);
        System.out.println(myLinkedList.get(2).value);
        //System.out.println(myLinkedList.get(4).value);
//        myLinkedList.set(0, 100);
//        myLinkedList.set(2, 200);
//        System.out.println(myLinkedList.get(0).value);
//        System.out.println(myLinkedList.get(2).value);
        myLinkedList.insert(2, 500);
        myLinkedList.printValues();
        System.out.println("\n");
        myLinkedList.printValues();
        myLinkedList.reverse();
        System.out.println("\n");
        myLinkedList.printValues();
    }
}