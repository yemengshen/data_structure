package com.com.sort.test;

import com.data.array.Queue_array;

import java.util.Arrays;

/**
 * @ProjectName: Data_test
 * @Package: com.com.sort.test
 * @ClassName: RadixSort
 * @Author: Lenovo
 * @Description: 基数排序，按照数组容器放置排序，有各位排序
 * @Date: 2019/5/21 22:09
 * @Version: 1.0
 */
public class RadixQueueSort {
    public static void main(String[] args) {
        int[] array={2,6,9,85,9,2,76,39,162,169};
        redixSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void redixSort(int[] array){
        //查询最大值
        int maxNumber=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>maxNumber){
                maxNumber=array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        //放置次数和最大值的位数相关
        int number=(maxNumber+"").length();
        //System.out.println(number);
        Queue_array[] temp=new Queue_array[10];
        for(int i=0;i<array.length;i++){
            temp[i]=new Queue_array();
        }
        for(int i=0,n=1;i<number;i++,n=n*10){
            //取每个数的值得余数，按位取，比如第一次个位、十位、百位、千位...取决于最大数的位数
            for(int j=0;j<array.length;j++){
                int remainder=(array[j]/n)%10;
                //System.out.println(remainder);
                temp[remainder].add(array[j]);
            }
            System.out.println(Arrays.toString(temp));
            //将存入的数重新放到数组
            int index=0;
            for(int k=0;k<temp.length;k++) {
                while(!temp[k].isEmpty()) {
                       array[index] =temp[k].pull();
                       index++;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

}
