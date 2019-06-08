package com.tree.test;

/**
 * @ProjectName: Data_test
 * @Package: com.tree.test
 * @ClassName: BinaryTree
 * @Author: Lenovo
 * @Description: 二叉树
 * @Date: 2019/5/26 9:09
 * @Version: 1.0
 */
public class BinaryTree {
    private TreeNode rootTreeNode;

    public TreeNode getRootTreeNode() {
        return rootTreeNode;
    }

    public void setRootTreeNode(TreeNode rootTreeNode) {
        this.rootTreeNode = rootTreeNode;
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

    public TreeNode frontSerarch(int i) {
        return rootTreeNode.frontSerarch(i);
    }

    public TreeNode midleSerarch(int i) {
        return rootTreeNode.midleSearch(i);
    }

    public TreeNode afterSerarch(int i) {
        return rootTreeNode.afterSerarch(i);
    }

    public void delete(int i) {
        if(rootTreeNode!=null){
            rootTreeNode.delete(i);
        }
    }
}
