package com.com.sort.test;

import java.util.Arrays;

/**
 * @ProjectName: Data_test
 * @Package: com.com.sort.test
 * @ClassName: ShellSort
 * @Author: Lenovo
 * @Description: 希尔排序算法，按步长进行分组，插入排序
 * @Date: 2019/5/17 9:26
 * @Version: 1.0
 */
public class ShellSort {
    public static void main(String[] args) {
        int array[]={8,5,9,6,1,2,7,3};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void shellSort(int[] array){
        int t=1;
        for(int d=array.length/2;d>0;d=d/2){
            for(int i=d;i<array.length;i++){
                for(int j=i-d;j>=0;j-=d){//防止数组下标越界异常，将j排在前面
                    if(array[j]>array[j+d]){
//                            int temp =array[j+d];
//                            array[j+d]=array[j];
//                            array[j]=temp;
                        array[j+d]=array[j]+array[j+d];
                        array[j]=array[j+d]-array[j];
                        array[j+d]=array[j+d]-array[j];
                    }
                }
            }
            System.out.println("第"+t+"次排序"+Arrays.toString(array));
            t++;
        }
    }
}
