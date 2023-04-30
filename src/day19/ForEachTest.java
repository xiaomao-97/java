package day19;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ForEachTest {
    @Test
    public void test3(){
        Collection col = new ArrayList();
        // add方法
        col.add("123");
        col.add(123);
        System.out.println(col);
        System.out.println(col.size());
        System.out.println(col.isEmpty());
        // 获取迭代类对象
        // 方式1
        Iterator iterator = col.iterator();
        System.out.println(iterator.getClass());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
         //方式2
        for(int i =0;i< col.size();i++){
            // 指针下移；将下移后集合位置上的元素返回
            System.out.println(iterator.next());
        }
        // 方式3
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("增强for循环");

        // 
        for(Object obj:col){
            System.out.println(obj);
        }
    }
}
