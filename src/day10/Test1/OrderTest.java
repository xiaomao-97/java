package day10.Test1;

import day10.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
//        order.orderDefault = 1;    出了包之后缺省的不可以调用
        order.orderPublic = 2;
    }
}
