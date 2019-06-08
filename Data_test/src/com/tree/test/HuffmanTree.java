package com.tree.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @ProjectName: Data_test
 * @Package: com.tree.test
 * @ClassName: HUffmanTree
 * @Author: Lenovo
 * @Description: 赫夫曼树/最优二叉树
 * @Date: 2019/6/7 10:45
 * @Version: 1.0
 * 创建赫夫曼树的流程:
 * 排序：
 * 取出根节点权值的最小的两颗二叉树
 * 组成一颗新的二叉树，前面取出来的两颗二叉树是新二叉树的两个子树
 * 根节点的权值是前两个取出来的两颗二叉树的根节点的权值之和
 */
public class HuffmanTree {
    public static void main(String[] args) {
        int[] array={3,7,8,29,5,11,23,14};
        System.out.println(huffmanTree(array));

    }
    public  static Node  huffmanTree(int[] array){
        List<Node> nodes=new ArrayList<>();
        for(int value: array){
            nodes.add(new Node(value));
        }
        while(nodes.size()>1){
            //排序：
            Collections.sort(nodes);
            System.out.println(nodes);
            //取出根节点权值的最小的两颗二叉树
            Node left=nodes.get(nodes.size()-1);
            Node right=nodes.get(nodes.size()-2);
            Node parent=new Node(left.getValue()+right.getValue());
            System.out.println(parent.getValue());
//            nodes.remove(left);
//            nodes.remove(right);
            nodes.remove(nodes.size()-1);
            nodes.remove(nodes.size()-1);
            nodes.add(parent);
        }
        return nodes.get(0);
    }
}
