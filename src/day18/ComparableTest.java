package day18;

import org.junit.Test;

import java.util.Arrays;

public class ComparableTest {
    @Test
    public void test1(){
        String[] arr = new String[]{"Tom", "Jerry", "Tony", "Rose"};
        Arrays.sort(arr);

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    @Test
    public void test2() {
        Product[] arr = new Product[5];
        arr[0] = new Product("HwMate50",6999);
        arr[1] = new Product("xiaomi50",4999);
        arr[2] = new Product("Vivo50",6999);
        arr[3] = new Product("iphone14promax",9999);
        arr[4] = new Product("Honor50",6299);
        Arrays.sort(arr);

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }


}
