package chapter18.grammar;

import org.junit.Test;

import java.util.HashSet;

public class OrderTest {

    @Test
    public void test1(){
        Order order1 = new Order(1001, "orderAA");
        System.out.println(order1);

        System.out.println(order1.orderId());
        System.out.println(order1.orderName());

        Order order2 = new Order(1001, "orderAA");
        System.out.println(order1.equals(order2));

        HashSet<Order> set = new HashSet<>();
        set.add(order1);
        set.add(order2);
        System.out.println(set);
    }

    // 测试record
    @Test
    public void test2(){
        Order1 order1 = new Order1(1001, "orderAA");
        System.out.println(order1);

        System.out.println(order1.orderId());
        System.out.println(order1.orderName());

        Order1 order2 = new Order1(1001, "orderAA");
        System.out.println(order1.equals(order2));

        HashSet<Order1> set = new HashSet<>();
        set.add(order1);
        set.add(order2);
        System.out.println(set);
    }

    @Test
    public void test3(){
        // 他已经有父类了
        Class<Person> personClass = Person.class;
        System.out.println(personClass.getSuperclass());
    }


}
