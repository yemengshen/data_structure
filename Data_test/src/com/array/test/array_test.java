package com.array.test;

/**
 * @ProjectName: Data_test
 * @Package: com.array.test
 * @ClassName: array_test
 * @Author: Lenovo
 * @Description: 数组的二分查找,主要是查找目标对象
 * @Date: 2019/5/20 10:58
 * @Version: 1.0
 */
public class array_test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 0;
        int end = array.length - 1;
        int target = 8;
        int middle = (end+start)/2;
        int index = -1;
        while (true) {
            if (array[middle] == target) {
                System.out.println("数组下标是" + middle);
                index = middle;
                break;
            } else {
                if (array[middle] > target) {
                    end=middle-1;
                }
                else {
                    start=middle+1;
                }
            }
            middle=(end+start)/2;
        }
    }
}
