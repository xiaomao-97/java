package day07;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        int [] arr1 = new int[]{1,2,3,4};
        int []  arr2 = new int[]{1,3,2,4};
        boolean isEqual = Arrays.equals(arr1,arr2);
        System.out.println(isEqual);

        System.out.println(Arrays.toString(arr1 ));
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[]{-98,-34,2,34,54,56,66,79,105,210,333};
        int index = Arrays.binarySearch(arr3,66);
        if(index>=0){
            System.out.println(index);
        }else {
            System.out.println("未找到");
        }
    }
}
