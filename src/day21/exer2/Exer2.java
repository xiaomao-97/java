package day21.exer2;

import org.junit.Test;

import java.util.Arrays;

public class Exer2 {
    public static <E> void method1(E[] e, int a , int b) {
        E temp = e[a];
        e[a] = e[b];
        e[b] = temp;
    }



    @Test
    public void test1(){
        String[] arr = new String[]{"AA", "BB", "CC"};
        method1(arr,0,2);
        System.out.println(Arrays.toString(arr));
    }

    public static <E> void method2(E[] e,int a,int b){
        for(int i =0,j=e.length-1;i<j;i++,j--){
            E temp = e[i];
            e[i] = e[j];
            e[j] = temp;

        }
    }


    @Test
    public void test2() {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6};
        method2(arr,0,2);
        System.out.println(Arrays.toString(arr));
    }
}
