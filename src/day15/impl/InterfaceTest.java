package day15.impl;


public class InterfaceTest{

}


interface  Attackable{
    void attack();
}
interface Flyable {
    // public static final 可以省略
    public static  final int MAX_SPEED =7900;
    int MIN_SPEED =1;

    public abstract void fly();

    //省略了public  abstract
    void stop();

}

class Palne implements  Flyable{
    @Override
    public void fly() {
        System.out.println("通过发动机起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速");

    }
}


abstract  class kite implements Flyable{
    @Override
    public void fly() {

    }
}

class Bullet extends Object implements Flyable,Attackable{
    @Override
    public void stop() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void attack() {

    }
}

interface AA{
    void method1();
}

interface BB{
    void method2();
}

interface  CC extends AA,BB{

}


