package day13;

//import com.sun.org.apache.xpath.internal.operations.Or;

import javax.swing.*;
import java.util.Objects;

public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(1001,"AA");
        Order order2 = new Order(1001,"BB");
        System.out.println(order1.equals(order2));  //true
        Order order3 = new Order(1001,"BB");
        System.out.println(order2.equals(order3));  //true

        String s1 = "BB";
        String s2 = "BB";
        System.out.println(s1=s2); //true
    }
}


class Order{
    private int orderId;
    private String orderName;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && Objects.equals(orderName, order.orderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderName);
    }
}
