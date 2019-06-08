package com.com.sort.test;

import java.util.Arrays;

/**
 * @ProjectName: Data_test
 * @Package: com.com.sort.test
 * @ClassName: HeapSort
 * @Author: Lenovo
 * @Description: 堆排序
 * @Date: 2019/5/30 8:13
 * @Version: 1.0
 */
public class HeapSort {
    //任何一个父节点的值都比子节点的值大
    public static void main(String[] args) {
        int[] array={8,9,3,6,7,2,1,10,5,0};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void heapSort(int[] array){
        //开始位置是最后一个非叶子节点，即最后一个节点的父节点
        int start=(array.length-1)/2;
        //调整为大顶堆
        for(int i=start;i>=0;i--){
            maxHeap(array,array.length,i);
        }
        for(int i=array.length-1;i>0;i--){
            //每一次大顶堆排序后将最大值放到最后
            int temp=array[0];
            array[0]=array[i];
            array[i]=temp;
            System.out.println(Arrays.toString(array));
            //将数组的第零个和堆中的最后一个数交换，再把前面的处理成大顶堆
            maxHeap(array,i,0);
            System.out.println(Arrays.toString(array));
            System.out.println("----------------");
        }
    }
    public static void maxHeap(int[] array,int size,int index){
        //左子节点
        int leftNode=2*index+1;
        //右子节点
        int rightNode=2*index+2;
        //定位的父节点
        int max=index;
        if(leftNode<size&&array[max]<array[leftNode]){
            max=leftNode;
        }
        if(rightNode<size&&array[max]<array[rightNode]){
            max=rightNode;
        }
        //交换最大值作为父节点
        if(max!=index){
            array[max]=array[max]+array[index];
            array[index]=array[max]-array[index];
            array[max]=array[max]-array[index];
            //交换后可能会破坏原来的堆，再排序比较
            maxHeap(array,size,max);
        }
    }
}
