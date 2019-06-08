package com.com.sort.test;

import java.util.Arrays;

/**
 * @ProjectName: Data_test
 * @Package: com.com.sort.test
 * @ClassName: InsertSort
 * @Author: Lenovo
 * @Description: 插入排序
 * @Date: 2019/5/16 23:13
 * @Version: 1.0
 */
public class InsertSort {
    public static void main(String[] args) {
        int array[]={8,5,9,6,1,2,7,3};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 插入排序
     * @param array
     */
    public static void insertSort(int[] array){
        //遍历所有数字
        for(int i=1;i<array.length;i++){
            //如果当前数字比前一个数字小的
            if(array[i]<array[i-1]){
                //把当前数字存到临时变量
                //int temp=array[i];
                //int j;
                //遍历当前数字前面的所有数字
                for(int j=i-1;j>=0&&array[j+1]<array[j];j--){
                    //把前一个数字赋值给后一个数字
                    array[j+1]=array[j]+array[j+1];
                    array[j]=array[j+1]-array[j];
                    array[j+1]=array[j+1]-array[j];
                }
                //把临时变量（外层的for循环的当前元素）赋给不满足条件的后一个元素
                //array[j+1]=temp;
            }
        }
    }
}
