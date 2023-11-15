package chapter18.lambda;

import org.junit.Test;

import java.util.Comparator;

public class LambdaTest
{
    @Test
    public void test1(){
        Runnable r1 =  new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };
        r1.run();
        System.out.println("*************");

        // Lambda表达式的写法

        Runnable r2 = () ->{
            System.out.println("我爱上海东方明珠");
        };
        r2.run();
    }


    @Test
    public  void test2(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        int compare1 = com1.compare(12,21);
        System.out.println(compare1);

        System.out.println("************");
        // lambda 表达式

        Comparator<Integer> com2 =(Integer o1, Integer o2) ->{
            return Integer.compare(o1,o2);
        };

        // lambda 表达式
        Comparator<Integer> com3 = (o1,o2) -> Integer.compare(o1,o2);
        int compare2 = com3.compare(23,21);
        System.out.println(compare2);

        System.out.println("*************");
        // 方法引用
        Comparator<Integer> com4 = Integer::compare;
        int compare4 = com4.compare(23,21);
        System.out.println(compare4);

    }

}
