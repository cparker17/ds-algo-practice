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


    public int length() {
        return length;
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
            Node temp = null;
            while (currentNode.next != null) {
                temp = currentNode;
                currentNode = currentNode.next;
            }
            tail = temp;
            tail.next = null;
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

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node currentNode = head;
        int count = 0;
        while (count != index) {
            currentNode = currentNode.next;
            count++;
        }
        return currentNode;
    }

    public boolean set(int index, int value) {
        if (index < 0 || index >= length) {
            return false;
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        currentNode.value = value;
        return true;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        } else if (index == 0) {
            prepend(value);
            return true;
        } else if (index == length) {
            append(value);
            return true;
        } else {
            Node node = new Node(value);
            Node previous = get(index - 1);
            node.next = previous.next;
            previous.next = node;
            length++;
            return true;
        }
    }

    public void printValues() {
        if (length == 0) {
            System.out.println("No values.");
        }
        Node currentNode = head;
        for (int i = 0; i < length; i++) {
            System.out.print(currentNode.value + " - ");
            currentNode = currentNode.next;
        }
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            Node node = get(0);
            head = node.next;
            return node;
        }
        if (index == length - 1) {
            Node node = get(index);
            tail = get(index - 1);
            return node;
        }
        Node node = get(index);
        Node prev = get(index -1);
        prev.next = node.next;
        length--;
        return node;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node beforeTemp = null;
        Node afterTemp;
        for (int i = 0; i < length; i++) {
            afterTemp = temp.next;
            temp.next = beforeTemp;
            beforeTemp = temp;
            temp = afterTemp;
        }
    }
}
