package com.CircularNode.test;

public class CircularNode {
    private int data;
    private CircularNode next=this;

    public CircularNode(int data) {
        this.data = data;
    }

    //追加节点


    //删除下一个节点
    public void removeNext(){
        CircularNode next_node=this.next.getNext();
        this.next=next_node;
    }
    //获取当前节点的下一个节点
    public CircularNode getNext(){
        return this.next;
    }
    //获取节点的数据
    public int getData() {
        return data;
    }
    //显示所有节点的信息


    //插入节点
    public void insertNode(CircularNode node){
        node.next=this.next;
        this.next=node;
    }
}

