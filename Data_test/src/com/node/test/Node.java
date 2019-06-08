package com.node.test;

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    //添加节点
    public Node append(Node node){
        //当前节点
        Node currentNode=this;
        //循环向后找
        while (true){
            Node nextNode=currentNode.next;
            //如果下一个节点为空，那么跳出循环
            if(nextNode==null){
               break;
            }
            //将下一个节点赋值给当前节点
            currentNode=nextNode;
        }
        //将要创建的节点接在最后一个节点上
        currentNode.next=node;
        //返回调用方法的节点
        return this;
    }
    //删除下一个节点
    public void removeNext(){
        Node next_node=this.next.next();
        this.next=next_node;
    }
    //获取当前节点的下一个节点
    public Node next(){
        return this.next;
    }
    //获取节点的数据
    public int getData() {
        return data;
    }
    //判断当前节点是否是最后一个节点
    public boolean isLast(){
        return this.next==null;
    }
    //显示所有节点的信息
    public void show(){
        //当前节点
        Node currentNode=this;
        while (true){
            System.out.print(currentNode.getData()+"->");
            currentNode=currentNode.next;
            if(currentNode==null){
                System.out.println("null");
                break;
            }
        }
    }

    //插入节点
    public void insertNode(Node node){
        node.next=this.next;
        this.next=node;
    }
}

