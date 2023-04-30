package day09;

public class ValueTransferTest {
    public static void main(String[] args) {
        int m  =10;
        int n = m;
        System.out.println("m="+m+",n="+n);
        n =20;
        System.out.println("m="+m+",n="+n);
        System.out.print("************************");
        System.out.println();

        Order order =  new Order();
        order.orderId = 1001;
        Order order1 = order;  // 赋值以后，order1和oder2的地址值相同，都指向了堆空间的同一个对象实体,赋值的是地址
        System.out.println("o1.orderId "+ order.orderId+"  o2.orderID"+order1.orderId);
        order1.orderId = 1002;
        System.out.println("o1.orderId "+ order.orderId+"  o2.orderID"+order1.orderId);

    }
}


class Order{
    int orderId;
}