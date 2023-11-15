package chapter18.lambda;

import org.junit.Test;
import org.junit.internal.runners.statements.RunAfters;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class LambdaTest1 {

    // 语法格式1 ：无参，无返回值
    @Test
    public void test1(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };
        r1.run();
        System.out.println("*************");

        Runnable r2 =() -> {
            System.out.println("我爱北京天安门");
        };
        r2.run();
    }

    // 语法格式2：Lambda需要一个参数，但是没有返回值
    @Test
    public void test2(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言的区别是什么");
        System.out.println("************");

        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("听说不一样");
    }

    // 语法格式3：数据类型可以省略，因为可由编译推断得，称为“类型推断”
    @Test
    public void test3(){
        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("如果大学可以重来，你最想重来的事情是啥？");
        System.out.println("*********");

        Consumer<String> con2 = (s) -> {
            System.out.println(s);
        };
        con1.accept("去趟旅行");
        System.out.println("*********");
    }

    @Test
    public void test3_1(){
        int[] arr = new int[]{1,2,3,4};
        //类型推断
        int[] arr1 = {1,2,3,4};

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        // 类型推断
        HashMap<String,Integer> map1 = new HashMap<>();


//        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

//        var entryset = map.entrySet();   jdk10中的类型推断
    }

    // 语法格式4：Lambda 若只需要一个参数时，参数的小括号可以省略
    @Test
    public void test4(){
        Consumer<String> con1 = s -> {System.out.println(s);};
        con1.accept("世界那么大，我想去看看");
        System.out.println("*************");
    }

    // 语法格式5：Lambda需要两个及以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test5(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };
        System.out.println(com1.compare(12,21));
        System.out.println("***********");


        Comparator<Integer> com2 =(o1, o2)-> {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            };
        System.out.println(com2.compare(12,21));
        System.out.println("***********");

    }


    // 语法格式6：当lambda体只有一条语句时候耨，return与大括号若有，都可以省略
    @Test
    public void test6(){
        Comparator<Integer> com1 = (o1,o2) ->{
            return  o1.compareTo(o2);
        };
        System.out.println(com1.compare(12,6));
        System.out.println("*********");

        Comparator<Integer> com2 = (o1,o2) -> o1.compareTo(o2);
        System.out.println(com2.compare(12,6));


    }











}
