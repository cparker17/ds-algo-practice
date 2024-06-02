package org.example;

public class BinarySearchTree {
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

    public boolean contains(int value) {
        if (root == null) {
            return false;
        }
        Node currentNode = root;
        while(true) {
            if (value == currentNode.value) {
                return true;
            } else if (value < currentNode.value) {
                currentNode = currentNode.leftChild;
                if (currentNode == null) {
                    return false;
                }
            } else {
                currentNode = currentNode.rightChild;
                if (currentNode == null) {
                    return false;
                }
            }
        }
    }

    public boolean recursiveInsert(int value) {
        if (root == null) {
            root = new Node(value);
            return true;
        }
        Node currentNode = root;
        if (value < currentNode.value) {
            return recursiveInsertLeft(value, currentNode);
        } else if (value > currentNode.value) {
            return recursiveInsertRight(value, currentNode);
        } else {
            return false;
        }
    }

    private boolean recursiveInsertLeft(int value, Node currentNode) {
        if (currentNode.leftChild == null) {
            currentNode.leftChild = new Node(value);
            return true;
        } else if (value == currentNode.leftChild.value) {
            return false;
        } else if (value < currentNode.leftChild.value) {
            return recursiveInsertLeft(value, currentNode.leftChild);
        } else {
            return recursiveInsertRight(value, currentNode.leftChild);
        }
    }

    private boolean recursiveInsertRight(int value, Node currentNode) {
        if (currentNode.rightChild == null) {
            currentNode.rightChild = new Node(value);
            return true;
        } else if (value == currentNode.rightChild.value) {
            return false;
        } else if (value < currentNode.rightChild.value) {
            return recursiveInsertLeft(value, currentNode.rightChild);
        } else {
            return recursiveInsertRight(value, currentNode.rightChild);
        }
    }
}
