package com.data.array;

public class Stack_Array {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Stack_Array array=new Stack_Array();
        array.push(1);
        array.push(2);
        array.push(3);
        System.out.println(array.pop());
        System.out.println(array.peek());
        System.out.println(array.isEmpty());
    }

    private int[] stack;
    //初始化栈
    public Stack_Array() {
        stack =new int[0];
    }
    //入栈
    public void push(int x) {
        int[] array=new int[stack.length+1];
        for(int i=0;i<stack.length;i++) {
            array[i]=stack[i];
        }
        array[stack.length]=x;
        stack=array;
    }
    //出栈
    public int pop() {
        if(stack.length==0) {
            throw new RuntimeException("stack is empty");
        }
        int x=stack[stack.length-1];
        int[] array=new int[stack.length-1];
        for(int i=0;i<stack.length-1;i++) {
            array[i]=stack[i];
        }
        stack=array;
        return x;
    }
    public int peek() {
        return stack[stack.length-1];
    }
    public boolean isEmpty() {
        return stack.length==0;
    }

}
