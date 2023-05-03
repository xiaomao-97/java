package day21;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericTest2 {
    @Test
    public void test1(){
        List<?> list = null;
        List<Object> list1 = null;
        List<String> list2 = null;
        list = list1;
        list = list2;
        method(list1);
        method(list2);
    }

    public void method(List<?> list){
        for(Object obj:list){
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        List<?> list = null;
        List<String> list1 = null;
        list1.add("AA");
        list = list1;
        method(list1);
        Object o = list.get(0);
        // 写入数据(以集合为例说明） -----失败
//        list.add("BB");
        // 特例：null,可以将null写入集合中
        list.add(null);

    }

    @Test
    public void test3() {
        List<? extends Father> list = null;
        List<Object> list1 = null;
        List<Father> list2 = null;
        List<Son> list3 = null;
        // 不可以赋值
//        list = list1;
        // 可以赋值
        list = list2;
        list = list3;
    }

    @Test
    public void test3_1() {
        List<? extends Father> list = null;
        List<Father> list2 = new ArrayList<>();
        list2.add(new Father());
        list = list2;
        // 读取数据
        Father father = list.get(0);
        // 写入数据，不可以的
        list.add(null);
    }

    @Test
    public void test4() {
        List<? super Father> list = null;
        List<Object> list1 = null;
        List<Father> list2 = null;
        List<Son> list3 = null;
        // 不可以赋值
        list = list1;
        list = list2;
//        list = list3;
    }

    @Test
    public void test4_1() {
        List<? super Father> list = null;
        List<Father> list1 = new ArrayList<>();
        list1.add(new Father());
        list = list1;
        // 读取数据
        Object object = list.get(0);

        // 写入数据
        list.add(null);
        list.add(new Father());
        list.add(new Son());

    }
}
