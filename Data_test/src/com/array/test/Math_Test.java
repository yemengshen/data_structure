package com.array.test;

/**
 * @ProjectName: Data_test
 * @Package: com.array.test
 * @ClassName: Math_Test
 * @Author: Lenovo
 * @Description:
 * @Date: 2019/5/26 22:55
 * @Version: 1.0
 */

public class Math_Test {
    private static int count=0;
    public static void main(String[] args) {
            double x=2;
            for(int i=1;i<=6;i++){
                x=x-(x*x*x -3*x-1)/(3*x*x-3);
                System.out.println("第"+i+"次"+x);
            }
        test(1,3);
    }
    public static void test(double j,double k) {
        count++;
        if (count <11) {
            double y = j * j * j - 3 * j - 1;
            double z = k * k * k - 3 * k - 1;
            if (y > 0 && z < 0) {
                double w = (j + k) / 2;
                double v = w * w * w - 3 * w - 1;
                if (v > 0) {
                    System.out.println("中间值"+w+"符号是+");
                    System.out.println(w+"---"+k+"---");
                    test(w, k);
                } else {
                    System.out.println("中间值"+w+"符号是-");
                    System.out.println(j+"---"+w+"---");
                    test(j, w);
                }
            } else if (y < 0 && z > 0) {
                double w = (j + k) / 2;
                double v = w * w * w - 3 * w - 1;
                if (v > 0) {
                    System.out.println("中间值"+w+"符号是+");
                    System.out.println(j+"---"+w+"---");
                    test(j, w);
                } else {
                    System.out.println("中间值"+w+"符号是-");
                    System.out.println(w+"---"+k+"---");
                    test(w, k);
                }
            }
            else{
                System.out.println("出错了");
            }
        }
    }
}
