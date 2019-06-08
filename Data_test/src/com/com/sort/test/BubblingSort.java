package com.com.sort.test;

import java.util.Arrays;

public class BubblingSort {
    public static void main(String[] args) {
        int[] array={5,18,16,5,3,9,6};
        System.out.println(Arrays.toString(array));
        bubbling(array);
        System.out.println(Arrays.toString(array));
    }
    //冒泡排序算法
    public static void bubbling(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    //System.out.println("交换之前"+array[i]+"------"+array[j+1]);
                    array[j]=array[j]+array[j+1];
                    //System.out.println(array[i]);
                    array[j+1]=array[j]-array[j+1];
                    //System.out.println(array[i+1]);
                    array[j]=array[j]-array[j+1];
                    //System.out.println("交换之后"+array[j]+"------"+array[j+1]);
                }
            }
        }
    }
}
