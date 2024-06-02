package org.example;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        //INSERT VALUE TEST
        System.out.println(bst.insertValue(1));
        System.out.println(bst.insertValue(5));
        System.out.println(bst.insertValue(3));

        System.out.println();

        //CONTAINS TEST
        System.out.println(bst.contains(5));
        System.out.println(bst.contains(7));
        System.out.println(bst.contains(1));

        System.out.println();

        //RECURSIVE INSERT TEST
        System.out.println(bst.recursiveInsert(100));
        System.out.println(bst.recursiveInsert(50));
        System.out.println(bst.recursiveInsert(2));
        System.out.println();
        System.out.println(bst.contains(100));
        System.out.println(bst.contains(50));
        System.out.println(bst.contains(2));
    }
}