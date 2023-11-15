package chapter18.reference;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefTest {

    //情况1：对象：：实例方法
    @Test
    public void test1(){
        Consumer<String> con1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con1.accept("hello");

        // lambda表达式
        Consumer<String> con2 = s ->  System.out.println(s);

        // 方法引用
        Consumer<String> con3 = System.out::println;
        con3.accept("hello");
    }

    @Test
    public void test2(){
        Emplyee emp = new Emplyee(1001, "马化腾");

        Supplier<String> sup1 = new Supplier<String>() {
            @Override
            public String get() {
                return emp.getName();
            }
        };

        System.out.println(sup1.get());
        // lamdba表达式
        Supplier<String> su2 = () -> emp.getName();

        // 方法引用
        Supplier<String> sup3 = emp::getName;
        System.out.println(sup3.get());


    }

    // 情况2 类：静态方法
    @Test
    public void test3(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        System.out.println(com1.compare(12,21));
        //lambda
        Comparator<Integer> com2 = (o1,o2) -> Integer.compare(o1,o2);
        System.out.println(com2.compare(12,21));
        // 方法引用
        Comparator<Integer> com3 = Integer::compare;
        System.out.println(com2.compare(12,21));
    }

    @Test
    public void test4(){

        Function<Double,Long> fun1 = new Function<Double,Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            };
        };

        // lambda
        Function<Double,Long>  fun2 = aDouble ->Math.round(aDouble);

        // 方法引用
        Function<Double,Long>  fun3 = Math::round;

    }

    @Test
    public void test5(){
        //
        Comparator<String> com1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(com1.compare("abc","abd"));

        //llmbda
        Comparator<String> com2 = (o1,o2) -> o1.compareTo(o2);
        System.out.println(com2.compare("abc","abd"));

        Comparator<String> com3 = String::compareTo;
        System.out.println(com3.compare("abc","abd"));

    }

    @Test
    public void test6(){
        BiPredicate<String,String>  biPre1 = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s1, String s2) {
                return s1.equals(s2);
            }
        };
        // lambda表达式
        BiPredicate<String,String>  biPre1 = (s1,s2) ->s1.equals(s2);

        // 方法引用
        BiPredicate<String,String>  biPre1 = String::equals;

    }









}
