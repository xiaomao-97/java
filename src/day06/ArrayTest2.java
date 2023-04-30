package day06;

public class ArrayTest2 {
    public static void main(String[] args) {
        // 二维数组的申明和初始化
        // 二维数组的静态申明
        int[] arr = new int[]{1,2,3};
        int[][] arr1 = new int[][]{{1,2,3},{2,4,5}};
        int [][]  arr4  = new int[][]{{1,2,3},{4,5},{6,7,8}};
        // 动态数组的初始化1
        String[][] arr2 = new String[3][2];
        // 动态数组的初始化2
        String[][] arr3 = new String[3][];   //此处报空指针异常是因为列中堆中并没有定义

        // 调用数组中指定位置的元素
        System.out.println(arr1[0][1]);
        System.out.println(arr2[1][1]); //空指针
//        System.out.println(arr3[1][0]); //空指针异常
        // 获取数组的长度
        System.out.println(arr4.length ); //3
        // 遍历数组
        for (int i = 0;i<arr4.length;i++){
            for (int j=0;j< arr4[i].length;j++){
                System.out.println(arr4[i][j]);
            }
            System.out.println();
        }
    }
}
