package com.tree.test;

/**
 * @ProjectName: Data_test
 * @Package: com.tree.test
 * @ClassName: TreeNode
 * @Author: Lenovo
 * @Description: 树的节点
 * @Date: 2019/5/26 9:11
 * @Version: 1.0
 */
public class TreeNode {
    private int value;
    private TreeNode leftTreeNode;
    private TreeNode rightTreeNode;

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(TreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public TreeNode getRightTreeNode() {
        return rightTreeNode;
    }

    public void setRightTreeNode(TreeNode rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
    }
    //前序遍历
    public void fromshow() {
        System.out.println(this.value);
        if(this.leftTreeNode!=null){
            this.leftTreeNode.fromshow();
        }
        if(this.rightTreeNode!=null){
            this.rightTreeNode.fromshow();
        }
    }
    //中序遍历
    public void midleshow() {
        if(this.leftTreeNode!=null){
            leftTreeNode.midleshow();
        }
        System.out.println(this.value);
        if(this.rightTreeNode!=null){
            rightTreeNode.midleshow();
        }
    }
    //后序遍历
    public void aftershow() {
        if(this.leftTreeNode!=null){
            leftTreeNode.aftershow();
        }
        if(this.rightTreeNode!=null){
            rightTreeNode.aftershow();
        }
        System.out.println(this.value);
    }

    //前序查找
    public TreeNode frontSerarch(int i) {
        TreeNode result=null;
        if(this.value==i){
            return this;
        }
        else{
            if(this.leftTreeNode!=null){
                result=this.leftTreeNode.frontSerarch(i);
            }
            if(result!=null){
                return result;
            }
           if(this.rightTreeNode!=null) {
               result=this.rightTreeNode.frontSerarch(i);
            }
        }
        return result;
    }

    //中序查找
    public TreeNode midleSearch(int i) {
            TreeNode result=null;
            if(this.leftTreeNode!=null){
                result=this.leftTreeNode.midleSearch(i);
            }
            if(this.value==i){
                return this;
            }
            if(result!=null){
                return result;
            }
            if(this.rightTreeNode!=null) {
                result=this.rightTreeNode.midleSearch(i);
            }
        return result;
    }

    public TreeNode afterSerarch(int i) {
        TreeNode result=null;
        if(this.leftTreeNode!=null){
            result=this.leftTreeNode.midleSearch(i);
        }
        if(result!=null){
            return result;
        }
        if(this.rightTreeNode!=null) {
            result=this.rightTreeNode.midleSearch(i);
        }
        if(this.value==i){
            return this;
        }
        return result;
    }

    //删除子树
    public void delete(int i) {
        TreeNode parenet=this;
        if(parenet.leftTreeNode!=null&&parenet.leftTreeNode.value==i){
            parenet.leftTreeNode=null;
            return;
        }
        if(parenet.rightTreeNode!=null&&parenet.rightTreeNode.value==i){
            parenet.rightTreeNode=null;
            return;
        }
        parenet=this.leftTreeNode;
        if(parenet!=null){
            parenet.delete(i);
        }
        parenet=this.rightTreeNode;
        if(parenet!=null){
            parenet.delete(i);
        }
    }
}
