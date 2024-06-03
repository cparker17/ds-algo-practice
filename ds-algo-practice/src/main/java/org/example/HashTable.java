package org.example;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    class Node {
        private String key;
        private int value;
        private Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        this.dataMap = new Node[size];
    }

    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (char ascii : keyChars) {
            hash = (hash + ascii * 17) % size;
        }
        return hash;
    }

    public boolean insert(String key, int value) {
        Node newNode = new Node(key, value);
        int index = hash(key);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node currentNode = dataMap[index];
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        return true;
    }
}
