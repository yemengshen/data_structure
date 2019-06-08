package com.clueTree.test;

import com.tree.test.BinaryTree;
import com.tree.test.TreeNode;

/**
 * @ProjectName: Data_test
 * @Package: com.tree.test
 * @ClassName: BinaryTreeTest
 * @Author: Lenovo
 * @Description: 测试类
 * @Date: 2019/5/26 9:14
 * @Version: 1.0
 */
public class ClueBinaryTreeTest {
    public static void main(String[] args) {
        ClueBinaryTree binaryTree=new ClueBinaryTree();
        ClueTreeNode rootTreeNode=new ClueTreeNode(1);
        binaryTree.setRootTreeNode(rootTreeNode);
        ClueTreeNode leftTreeNode=new ClueTreeNode(2);
        rootTreeNode.setLeftTreeNode(leftTreeNode);
        ClueTreeNode rightTreeNode=new ClueTreeNode(3);
        rootTreeNode.setRightTreeNode(rightTreeNode);
        leftTreeNode.setLeftTreeNode(new ClueTreeNode(4));
        leftTreeNode.setRightTreeNode(new ClueTreeNode(5));
        rightTreeNode.setLeftTreeNode(new ClueTreeNode(6));
        rightTreeNode.setRightTreeNode(new ClueTreeNode(7));
        //前序遍历
        //binaryTree.fromshow();
        //中序遍历
        //binaryTree.midleshow();
        //后序遍历
        //binaryTree.aftershow();
        //前序查找
//        TreeNode result=binaryTree.frontSerarch(5);
//        System.out.println(result.getValue());
        //中序查找
//        TreeNode result=binaryTree.midleSerarch(5);
//        System.out.println(result.getValue());
        //后序查找
//        TreeNode result=binaryTree.afterSerarch(5);
//        System.out.println(result.getValue());
        //删除子树
//        binaryTree.fromshow();
//        System.out.println("========");
//        binaryTree.delete(6);
//        binaryTree.fromshow();
        binaryTree.midleshow();
        binaryTree.clueTreeNodes();
        System.out.println("-----------------");
        binaryTree.clueShowTreeNode();
    }
}
