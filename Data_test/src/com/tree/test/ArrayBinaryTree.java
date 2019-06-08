package com.tree.test;

/**
 * @ProjectName: Data_test
 * @Package: com.tree.test
 * @ClassName: ArrayBinaryTree
 * @Author: Lenovo
 * @Description: 顺序存储二叉树
 * @Date: 2019/5/28 9:03
 * @Version: 1.0
 */
public class ArrayBinaryTree {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        ArrayBinaryTree arrayBinaryTree=new ArrayBinaryTree(array);
        arrayBinaryTree.fromshow(0);
    }
    private static int[] array;

    public ArrayBinaryTree(int[] array) {
        this.array = array;
    }
    public static void fromshow(int start){
        if(array==null||array.length==0){
            return;
        }
        System.out.println(array[start]);
        if(2*start+1<array.length){
            fromshow(2*start+1);
        }
        if(2*start+2<array.length){
            fromshow(2*start+2);
        }
    }
}
