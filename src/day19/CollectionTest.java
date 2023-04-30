package day19;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionTest {
    @Test
    public void test(){
        Collection col = new ArrayList();
         // add方法
        col.add("123");
        col.add(123);
        System.out.println(col);
        System.out.println(col.size());
        // addAll方

    }

    @Test
    public void test1(){
        Collection col = new ArrayList();
        // add方法
        col.add("123");
        col.add(123);
        System.out.println(col);
        System.out.println(col.size());
        System.out.println(col.isEmpty());
        // addAll方

    }


    @Test
    public void test2(){
        Collection col = new ArrayList();
        // add方法
        col.add("123");
        col.add(123);
        System.out.println(col);
        System.out.println(col.size());
        System.out.println(col.isEmpty());
        // 集合---->数组
        Object[] arr =col.toArray();
        System.out.println(Arrays.toString(arr));

    }

    // 数组  ------>集合
    @Test
    public void test4(){
        String[] arr = new String[]{"aa", "bb"};
        //
//        Collection Strings = Arrays.asList(arr);

        List<String> strings = Arrays.asList(arr);

    }

    @Test
    public void test5(){
        Integer[] arr = new Integer[]{1, 2, 3};
        List list = Arrays.asList(arr);
        System.out.println(list.size());  //3

        int[] arr1 = new int[]{1, 2, 3};
        List list1 = Arrays.asList(arr1);
        System.out.println(list1.size()); //1

        //
//        Collection Strings = Arrays.asList(arr);


    }


}
