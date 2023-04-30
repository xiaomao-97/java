package day06;

//二维数组的默认初始化值

// 数组的内存解析

public class ArrayTest3 {
    public static void main(String[] args) {
        int[][]  arr = new int[4][3];
        System.out.println(arr[0]); // 地址池
        System.out.println(arr[0][0]); //0
        System.out.println(arr) ; // 地址池

        int[][] arr1 = new int[4][];
        System.out.println(arr1[0]); //null
//        System.out.println(arr1[0][0]); //null指针异常
    }

}
