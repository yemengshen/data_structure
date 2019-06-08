package com.clueTree.test;

/**
 * @ProjectName: Data_test
 * @Package: com.tree.test
 * @ClassName: TreeNode
 * @Author: Lenovo
 * @Description: 树的节点
 * @Date: 2019/5/26 9:11
 * @Version: 1.0
 */
public class ClueTreeNode {
    private int value;
    private ClueTreeNode leftTreeNode;
    private ClueTreeNode rightTreeNode;
    private int leftValue;
    private int rightValue;

    public ClueTreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ClueTreeNode getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(ClueTreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public ClueTreeNode getRightTreeNode() {
        return rightTreeNode;
    }

    public int getLeftValue() {
        return leftValue;
    }

    public void setLeftValue(int leftValue) {
        this.leftValue = leftValue;
    }

    public int getRightValue() {
        return rightValue;
    }

    public void setRightValue(int rightValue) {
        this.rightValue = rightValue;
    }

    public void setRightTreeNode(ClueTreeNode rightTreeNode) {
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
    public ClueTreeNode frontSerarch(int i) {
        ClueTreeNode result=null;
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
    public ClueTreeNode midleSearch(int i) {
            ClueTreeNode result=null;
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

    public ClueTreeNode afterSerarch(int i) {
        ClueTreeNode result=null;
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
        ClueTreeNode parenet=this;
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
