package day15;

public class InnerClassTest {
    public static void main(String[] args) {
        // 创建Dog实例
        Person.Dog dog = new Person.Dog();
        // 非静态
        Person person = new Person();
        Person.Bird bird = person.new Bird();
        bird.show();

    }

}

class  Person{
    String name;
    int age;

    public void eat(){
        System.out.println("人吃饭");
    }
    // 成员内部类
    static class Dog{

    }

    // 非静态成员内部类
    class Bird{
        String name;
        int age;

        public void  show(){
            System.out.println("hhhh");
            Person.this.eat();   //调用外部类的属性
        }

        public Bird(){

        }

        public void display(String name){
            System.out.println(name);   // 方法的形参
            System.out.println(this.name);  //内部类的形参
            System.out.println(Person.this.name);  // 外部类的属性
        }
    }


    public void method(){
        class AA{

        }
    }

    {
        class BB{

        }
    }

    public Person(){
        class cc{

        }
    }
}
