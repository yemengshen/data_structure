package com.data.array;

import java.util.Arrays;

public class Queue_array {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Queue_array array=new Queue_array();
        array.add(1);
        array.add(2);
        array.add(3);
        System.out.println(array.pull());
        System.out.println(array.peek());
        System.out.println(array.isEmpty());
    }
    private int[] stack;
    //初始化队列
    public Queue_array() {
        stack =new int[0];
    }
    //入队
    public void add(int x) {
        int[] array=new int[stack.length+1];
        for(int i=0;i<stack.length;i++) {
            array[i]=stack[i];
        }
        array[stack.length]=x;
        stack=array;
    }
    //出队
    public int pull() {
        int[] array=new int[stack.length-1];
        for(int i=0;i<stack.length-1;i++) {
            array[i]=stack[i+1];
        }
        int x=stack[0];
        stack=array;
        //System.out.println(Arrays.toString(stack));
        return x;
    }
    //获取队头
    public int peek() {
        return stack[0];
    }
    //判断是否为空
    public boolean isEmpty() {
        return stack.length==0;
    }

    @Override
    public String toString() {
        return "Queue_array{" +
                "stack=" + Arrays.toString(stack) +
                '}';
    }
}
