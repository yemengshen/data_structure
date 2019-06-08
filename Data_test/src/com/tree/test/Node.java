package com.tree.test;

/**
 * @ProjectName: Data_test
 * @Package: com.tree.test
 * @ClassName: NodeTree
 * @Author: Lenovo
 * @Description: 赫夫曼树的节点属性
 * @Date: 2019/6/7 10:45
 * @Version: 1.0
 */
public class Node implements Comparable<Node>{
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(Node o) {
        return -(this.value-o.value);
    }
}
