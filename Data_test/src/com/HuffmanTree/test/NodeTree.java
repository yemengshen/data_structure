package com.HuffmanTree.test;

import com.node.test.Node;

/**
 * @ProjectName: Data_test
 * @Package: com.HuffmanTree.test
 * @ClassName: NdoeTree
 * @Author: Lenovo
 * @Description: 哈夫曼树的节点
 * @Date: 2019/6/8 10:30
 * @Version: 1.0
 */
public class NodeTree implements Comparable<NodeTree>{
    private Byte data;
    private int weight;
    private NodeTree left;
    private NodeTree right;

    public NodeTree(Byte data, int weight) {
        this.data = data;
        this.weight = weight;
    }

    public Byte getData() {
        return data;
    }

    public void setData(Byte data) {
        this.data = data;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public NodeTree getLeft() {
        return left;
    }

    public void setLeft(NodeTree left) {
        this.left = left;
    }

    public NodeTree getRight() {
        return right;
    }

    public void setRight(NodeTree right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "NodeTree{" +
                "data=" + data +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(NodeTree o) {
        return o.weight-this.weight;
    }
}
