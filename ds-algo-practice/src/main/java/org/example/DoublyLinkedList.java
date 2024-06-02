package org.example;

public class DoublyLinkedList {
    int length;
    Node head;
    Node tail;

    class Node {
        int value;
        Node next;
        Node previous;

        public Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList() {
        length = 0;
        head = null;
        tail = null;
    }

    public int length() {
        return length;
    }

    public void printValues() {
        if (length == 0) {
            System.out.println("No values to print.");
        } else {
            Node currentNode = head;
            for (int i = 0; i < length; i++) {
                System.out.print(currentNode.value + " ");
                currentNode = currentNode.next;
            }
        }
    }

    public void append(int value) {
        if (length == 0) {
            head = new Node(value);
            tail = head;
        } else {
            Node node = new Node(value);
            node.previous = tail;
            tail.next = node;
            tail = node;
        }
        length++;
    }

    public void prepend(int value) {
        if (length == 0) {
            head = new Node(value);
            tail = head;
        } else {
            Node node = new Node(value);
            node.next = head;
            head.previous = node;
            head = node;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node removedNode = head;
        head = head.next;
        head.previous = null;
        length--;
        return removedNode;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node removedNode = tail;
        tail = removedNode.previous;
        tail.next = null;
        length--;
        return removedNode;
    }

    
}
