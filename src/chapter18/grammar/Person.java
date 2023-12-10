package chapter18.grammar;

public record Person(int id,String name) {
    //还可以在 record 声明的类中定义静态字段、静态方法、构造器或实例方法。
    //• 不能在 record 声明的类中定义实例字段；类不能声明为 abstract；不能声明显式的父类等。

    static String info = "我是一个人";

    public static void show(){
        System.out.println("我是一个人");
    }

    public Person(){
        this(0, null);
    }


    public void eat(){
        System.out.println("人吃饭");
    }





}
