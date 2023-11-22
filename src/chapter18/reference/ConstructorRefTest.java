package chapter18.reference;

import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorRefTest {


    // 构造器引用
    // Supplier中的T get()
    @Test
    public void test1(){
        Supplier<Emplyee> sup1 = new Supplier<Emplyee>() {

            @Override
            public Emplyee get() {
                return new Emplyee();
            }
        };
        System.out.println(sup1.get());


        // 方法引用
        Supplier<Emplyee> sup2 = Emplyee::new;  // 调用的是Employee类中get()的空参构造器，get()中没有参数，是空参构造器
        System.out.println(sup2.get());


    }

    // Function中R apply(T,t)
    @Test
    public void test2(){
        Function<Integer,Emplyee> func1 = new Function<Integer, Emplyee>() {
            @Override
            public Emplyee apply(Integer id) {
                return new Emplyee(id);
            }
        };
        System.out.println(func1.apply(12));

        // 构造器引用
        Function<Integer,Emplyee> fun2 = Emplyee::new;    // 调用的是Employee类中参数时Interger的构造器， apply(Integer id)对应的是integer的构造器
        System.out.println(fun2.apply(12));


    }

    // BiFunction中R apply(T t,U u)
    @Test
    public void test3(){
        BiFunction<Integer,String,Emplyee> fun2 = new BiFunction<Integer,String,Emplyee>(){
            @Override
            public Emplyee apply(Integer id, String name) {
                return new Emplyee(id,name);
            }
        };
        System.out.println(fun2.apply(12,"tom"));

        // 构造器引用
        BiFunction<Integer,String,Emplyee> fun3 = Emplyee::new ;
        System.out.println(fun3.apply(12,"tom"));
    }

    // 数组引用
    //Function中R apply(T t)
    @Test
    public void test4(){
        Function<Integer,Emplyee[]> fun1 = new Function<Integer, Emplyee[]>() {
            @Override
            public Emplyee[] apply(Integer length) {
                return new Emplyee[length];
            }
        };
        System.out.println(fun1.apply(10).length);
        // 数组引用
        Function<Integer,Emplyee[]> fun2 =Emplyee[] :: new;
        System.out.println(fun1.apply(20).length);

    }




}
