package day21;

import day19.SubOrder5;
import org.junit.Test;

import java.util.ArrayList;

public class GenericTest {

    @Test
    public void test1(){
        Order<Integer> objectOrder = new Order<Integer>();
        Integer t = objectOrder.getT();
    }

    // 测试order的子类
    @Test
    public void test2() {
        SubOrder1 subOrder1 = new SubOrder1();
        // 此处默认是object类型
        Object t = subOrder1.getT();
    }

    @Test
    public void test3() {
        SubOrder2 subOrder1 = new SubOrder2();
        // 此处默认是object类型
        Integer t = subOrder1.getT();
    }

    @Test
    public void test4() {
        SubOrder3<String> subOrder1 = new SubOrder3<>();
        // 此处默认是object类型
        String t = subOrder1.getT();
    }

    @Test
    public void test5() {
        SubOrder4<String> subOrder1 = new SubOrder4<>();
        // 此处默认是object类型
        Integer t = subOrder1.getT();
        String e = subOrder1.getE();

    }


    @Test
    public void test6() {
        SubOrder5<String,Integer> subOrder1 = new SubOrder5<>();
        // 此处默认是object类型
        String t = subOrder1.getT();
        Integer e = subOrder1.getE();

    }

    // 测试泛型方法
    //说明
    // > 声明泛型方法的时候，一定要添加泛型参数<T>
    // > 泛型参数在方法调用的时候，指定具体的类型
    // > 泛型方法可以根据需要申明static的
    // > 泛型方法所属的类是不是泛型类没有关系
    @Test
    public void test7() {
        Order<String> order = new Order<>();
        Integer[] integer = new Integer[]{1, 2, 3, 4, 5};
        ArrayList<Integer> integers = order.copyFromArrayToList(integer);
        System.out.println(integers);
    }
}
