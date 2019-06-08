package com.CircularNode.test;

public class Circular_Test {
    public static void main(String[] args) {
        CircularNode n1=new CircularNode(1);
        CircularNode n2=new CircularNode(2);
        CircularNode n3=new CircularNode(3);
        CircularNode n4=new CircularNode(4);
        n1.insertNode(n2);
        System.out.println(n1.getNext().getData());
        System.out.println(n2.getNext().getData());
    }
}
