package com.com.sort.test;

import java.util.Arrays;

/**
 * @ProjectName: Data_test
 * @Package: com.com.sort.test
 * @ClassName: SelectSort
 * @Author: Lenovo
 * @Description: 选择排序
 * @Date: 2019/5/18 23:15
 * @Version: 1.0
 */
public class SelectSort {
    public static void main(String[] args) {
        int array[]={6,5,9,3,1,7,5,6,3};
        selectSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Integer.MIN_VALUE);
    }
    //选择排序
    public static void selectSort(int array[]){
        //遍历所有数
        for(int i=0;i<array.length;i++){
            int minIndex=i;
            //把当前遍历的数和后面的数依次进行比较，并记录下最小的数的下标
            for(int j=i+1;j<array.length;j++){
                //如果后面的数比记录最小的数小
                if(array[minIndex]>array[j]){
                    //记录最小的那个数的下标
                    minIndex=j;
                }
            }
            //如果最小的数和当前遍历数的下标不一致
            if(minIndex!=i){
                array[i]=array[i]+array[minIndex];
                array[minIndex]=array[i]-array[minIndex];
                array[i]=array[i]-array[minIndex];
            }
        }
    }
}
