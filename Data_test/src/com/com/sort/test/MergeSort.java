package com.com.sort.test;

import java.util.Arrays;

/**
 * @ProjectName: Data_test
 * @Package: com.com.sort.test
 * @ClassName: MergeSort
 * @Author: Lenovo
 * @Description: 归并排序
 * @Date: 2019/5/20 11:15
 * @Version: 1.0
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array={1,5,6,9,8,6,7,3};
        //System.out.println((array.length-1)/2);
        //mergeSort(array,0,(array.length-1)/2,array.length-1);
        mergeSort_Count(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void mergeSort_Count(int[] array,int begin,int end){
        int middle=(end+begin)/2;
        //System.out.println("拆分"+middle);
        if(begin<end){
            mergeSort_Count(array,begin,middle);
            mergeSort_Count(array,middle+1,end);
            mergeSort(array,begin,middle,end);
        }
    }
    public static void mergeSort(int[] array,int begin,int middle,int end){
        int[] temp=new int[end-begin+1];
        //System.out.println("temp的长度"+temp.length);
        int i=begin;
        int j=middle+1;
        int index=0;
        while (i<=middle&&j<=end){
            if(array[i]<=array[j]){
                temp[index]=array[i];
                i++;
                //System.out.println("存入第"+i+"个数"+i);
            }
            else{
                temp[index]=array[j];
                j++;
                //System.out.println("存入第"+j+"个数"+j);
            }
            index++;
        }
       // System.out.println(i+"-----"+j);
        //处理多余数据
        while (j<=end){
            System.out.println(j);
            temp[index]=array[j];
            j++;
            index++;
        }
        while (i<=middle){
            temp[index]=array[i];
            i++;
            index++;
        }
        for(int k=0;k<temp.length;k++){
            //由于分段归并，所以准确位置
            array[k+begin]=temp[k];
        }
        System.out.println(Arrays.toString(temp));
    }
}
