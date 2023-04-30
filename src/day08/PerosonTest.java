package day08;

public class PerosonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 3;
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);
        System.out.println(p1.age);

        // 调用方法
        p1.eat();
        p1.sleep();
        p1.talk("english");

        //****************************//
        Person p2 = new Person();
        System.out.println(p2.name);

        // 将p1变量保存的对象地址池赋给p3，导致p1和p3指向了堆空间的同一个对象实体
        Person p3 = p1;
        System.out.println(p3.name);

    }
}

class Person{
    String name;
    int age =1;
    boolean isMale;

    public void eat(){
        System.out.println("人可以睡觉");
    }

    public void sleep(){
        System.out.println("人可以睡觉");
    }

    public void talk(String language){
        System.out.println("人可以说话");
    }
}