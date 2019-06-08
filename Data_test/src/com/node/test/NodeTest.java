package com.node.test;

public class NodeTest {
    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        n1.append(n2).append(n3);
        System.out.println(n1.next().next().getData());
        System.out.println(n3.isLast());
        n1.show();
        n1.next().removeNext();
        n1.show();
        n1.insertNode(new Node(4));
        n1.show();
    }
}
