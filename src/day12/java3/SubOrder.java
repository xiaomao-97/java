package day12.java3;

import day12.java2.Order;

public class SubOrder extends Order {
    public void method(){
        orderProtected =1;
        orderPublic=1;
        methodProtected();
        methodPublic();
        // 在不同包的子类中，不能调用Order类中申明的为private和缺省权限的属性和方法
    }
}
