package org.example;

public class BinarySearchTree {
    int height;
    Node root;

    class Node {
        int value;
        Node leftChild;
        Node rightChild;

        public Node(int value) {
            this.value = value;
        }
    }

    public boolean insertValue(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        } else {
            Node currentNode = root;
            while (true) {
                if (value < currentNode.value) {
                    if (currentNode.leftChild == null) {
                        currentNode.leftChild = newNode;
                        return true;
                    } else {
                        currentNode = currentNode.leftChild;
                    }
                } else if (value > currentNode.value) {
                    if (currentNode.rightChild == null) {
                        currentNode.rightChild = newNode;
                        return true;
                    } else {
                        currentNode = currentNode.rightChild;
                    }
                } else {
                    return false;
                }
            }

        }
    }

    public boolean lookup(int value) {
        return true;
    }
}

