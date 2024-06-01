package org.example;

public class LinkedList {
    int value;
    Node head;
    Node tail;
    int length;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = head;
        length = 1;
    }

    public void append(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        length++;
    }

    public void prepend(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
            length++;
        }
    }

    public Node removeLast() {
        Node currentNode = head;
        if (head == null) {
            return null;
        } else if (head.next == null) {
            head = null;
            tail = null;
            return currentNode;
        } else {
            while (currentNode.next != tail) {
                currentNode = currentNode.next;
            }
            tail = currentNode;
            length--;
            return currentNode;
        }
    }

    public Node removeFirst() {
        Node currentNode = head;
        if (currentNode == null) {
            return null;
        } else {
            head = head.next;
            return currentNode;
        }
    }
}
