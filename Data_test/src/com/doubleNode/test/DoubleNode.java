package com.doubleNode.test;

public class DoubleNode {
    //上一个节点
    private DoubleNode prefix=this;
    //下一个节点
    private DoubleNode next=this;
    private int data;

    public DoubleNode(int data) {
        this.data = data;
    }
    public void after(DoubleNode node){
        //原来的下一个节点
        DoubleNode nextNext=this.next;
        this.next=node;
        node.prefix=this;
        node.next=nextNext;
        nextNext.prefix=node;
    }
    public DoubleNode getNext(){
        return this.next;
    }
    public DoubleNode setPrefix(){
        return this.prefix;
    }

    public int getData() {
        return data;
    }
}
