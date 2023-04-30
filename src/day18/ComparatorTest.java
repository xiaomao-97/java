package day18;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    @Test
    public void  test(){
        Product[] arr = new Product[5];
        arr[0] = new Product("HwMate50",6999);
        arr[1] = new Product("xiaomi50",4999);
        arr[2] = new Product("Vivo50",6999);
        arr[3] = new Product("iphone14promax",9999);
        arr[4] = new Product("Honor50",6299);
        // 如何判断两个对象的o1，o2的大小，其标准就是此方法提要填写逻辑
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Product && o2 instanceof Product){
                    Product p1 = (Product) o1;
                    Product p2 =(Product) o2;
                    return Double.compare(p1.getPrice(), p2.getPrice());
                }
                throw new RuntimeException("类型异常");
            }
        };
        Arrays.sort(arr,comparator);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }



}
