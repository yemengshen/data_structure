package com.com.sort.test;

import java.util.Arrays;

/**
 * @ProjectName: Data_test
 * @Package: com.com.sort.test
 * @ClassName: QuickSort
 * @Author: Lenovo
 * @Description: 快速排序
 * @Date: 2019/5/15 22:10
 * @Version: 1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array={5,8,2,3,6,7,3};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int array[],int start,int end) {
        if (start < end) {
            int index = array[start];
            int low = start;
            int high = end;
            while (low < high) {
                while (low < high && array[high] >= index) {
                    high--;
                }
                array[low] = array[high];
                //System.out.println(Arrays.toString(array));
                while (low < high && array[low] <= index) {
                    low++;
                }
                array[high] = array[low];
                //System.out.println(Arrays.toString(array));
            }
            array[low] = index;
            //quickSort(array,0,);
            System.out.println(Arrays.toString(array));
            quickSort(array, 0, low);
            quickSort(array, low + 1, end);
        }
    }
}
