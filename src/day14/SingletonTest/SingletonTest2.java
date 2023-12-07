package day14.SingletonTest;

//import com.sun.org.apache.xpath.internal.operations.Or;

public class SingletonTest2 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order1==order2);
    }
}

//懒汉式，区别在于是否初始化
class Order{
    // 私有化类的构造器
    private Order(){

    }
    //申明类的对象，没有初始化
    //此对象也必须申明为static
    private static  Order instance = null;

    //声明public、static返回当前类对象的方法；
    public static Order getInstance(){
        if(instance ==null){
            instance = new Order();
        }
        return instance;
    }

}