package com.tree.test;

/**
 * @ProjectName: Data_test
 * @Package: com.tree.test
 * @ClassName: BinaryTreeTest
 * @Author: Lenovo
 * @Description: 测试类
 * @Date: 2019/5/26 9:14
 * @Version: 1.0
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        TreeNode rootTreeNode=new TreeNode(1);
        binaryTree.setRootTreeNode(rootTreeNode);
        TreeNode leftTreeNode=new TreeNode(2);
        rootTreeNode.setLeftTreeNode(leftTreeNode);
        TreeNode rightTreeNode=new TreeNode(3);
        rootTreeNode.setRightTreeNode(rightTreeNode);
        leftTreeNode.setLeftTreeNode(new TreeNode(4));
        leftTreeNode.setRightTreeNode(new TreeNode(5));
        rightTreeNode.setLeftTreeNode(new TreeNode(6));
        rightTreeNode.setRightTreeNode(new TreeNode(7));
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
        binaryTree.fromshow();
        System.out.println("========");
        binaryTree.delete(6);
        binaryTree.fromshow();

    }
}
