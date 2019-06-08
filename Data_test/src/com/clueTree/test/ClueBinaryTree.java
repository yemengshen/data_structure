package com.clueTree.test;

import com.tree.test.TreeNode;

/**
 * @ProjectName: Data_test
 * @Package: com.tree.test
 * @ClassName: BinaryTree
 * @Author: Lenovo
 * @Description: 二叉树
 * @Date: 2019/5/26 9:09
 * @Version: 1.0
 */
public class ClueBinaryTree {
    private ClueTreeNode rootTreeNode;
    private ClueTreeNode pre;
    public ClueTreeNode getRootTreeNode() {
        return rootTreeNode;
    }

    public void setRootTreeNode(ClueTreeNode rootTreeNode) {
        this.rootTreeNode = rootTreeNode;
    }

    //中序线索化二叉树
    public void clueTreeNodes(){
        clueTreeNode(rootTreeNode);
    }
    public void clueTreeNode(ClueTreeNode rootTreeNode){
        if(rootTreeNode==null){
            return;
        }
        //处理左子树，
        clueTreeNode(rootTreeNode.getLeftTreeNode());
        //处理当前驱节点
        if(rootTreeNode.getLeftTreeNode()==null){
            rootTreeNode.setLeftTreeNode(pre);
            rootTreeNode.setLeftValue(1);
        }
        if(pre!=null&&pre.getRightTreeNode()==null){
            pre.setRightTreeNode(rootTreeNode);
            pre.setRightValue(1);
        }
        pre=rootTreeNode;
        // 再处理右子树
        clueTreeNode(rootTreeNode.getRightTreeNode());
    }
    //便利线索二叉树
    public void clueShowTreeNode(){
        //用于临时存储当前遍历节点
        ClueTreeNode node =rootTreeNode;
        while(node!=null){
            //循环找到最开始的点
            while (node.getLeftValue()==0) {
                node = node.getLeftTreeNode();
            }
            //打印当前节点的值
            System.out.println(node.getValue());
            //如果当前节点的右指针指向的是后继结点，后继结点可能还有后继结点
            while(node.getRightValue()==1){
                node= node.getRightTreeNode();
                System.out.println(node.getValue());
            }
            node=node.getRightTreeNode();
        }
    }
    public void fromshow() {
        if(rootTreeNode!=null) {
            rootTreeNode.fromshow();
        }
    }

    public void midleshow() {
        if(rootTreeNode!=null) {
            rootTreeNode.midleshow();
        }
    }

    public void aftershow() {
        if(rootTreeNode!=null) {
            rootTreeNode.aftershow();
        }
    }

    public ClueTreeNode frontSerarch(int i) {
        return rootTreeNode.frontSerarch(i);
    }

    public ClueTreeNode midleSerarch(int i) {
        return rootTreeNode.midleSearch(i);
    }

    public ClueTreeNode afterSerarch(int i) {
        return rootTreeNode.afterSerarch(i);
    }

    public void delete(int i) {
        if(rootTreeNode!=null){
            rootTreeNode.delete(i);
        }
    }
}
