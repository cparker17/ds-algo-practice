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

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public Node set(int index, int value) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node node = get(index);
        node.value = value;
        return node;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node previousNode = head;
        for (int i = 1; i < index; i++) {
            previousNode = previousNode.next;
        }
        Node nextNode = previousNode.next;
        previousNode.next = newNode;
        newNode.previous = previousNode;
        newNode.next = nextNode;
        nextNode.previous = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index > length) {
            return null;
        }
        Node nodeToReturn = head;
        for (int i = 0; i < index; i++) {
            nodeToReturn = nodeToReturn.next;
        }
        nodeToReturn.previous.next = nodeToReturn.next;
        nodeToReturn.next.previous = nodeToReturn.previous;
        length--;
        return nodeToReturn;
    }
}
