package com.Recursive_Test;

/*
实现斐波那契数列：以兔子繁殖为例子而引入，故又称为“兔子数列”，
指的是这样一个数列：1、1、2、3、5、8、13、21、34、……
在数学上，斐波纳契数列以如下被以递推的方法定义：F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
在现代物理、准晶体结构、化学等领域，斐波纳契数列都有直接的应用，
为此，美国数学会从1963年起出版了以《斐波纳契数列季刊》为名的一份数学杂志，用于专门刊载这方面的研究成果。
 */
public class Recursive_Test1 {
    public static void main(String[] args) {
       // System.out.println(recursive(8));
        honota(2,"A","B","C");
    }
    public static int recursive(int n){
        if(n==1|| n==2){
            return 1;
        }
        else{
            return recursive(n-2)+recursive(n-1);
        }
    }
    //汉若塔思想
    public static  void honota(int n, String from, String in, String to){
        if(n==1){
            System.out.println("第1个盘子从"+from+"移动到"+to);
        }
        else{
            honota(n-1,from,to,in);
            System.out.println("第"+n+"个盘子从"+from+"移动到"+to);
            honota(n-1,in,from,to);
        }
    }
}
