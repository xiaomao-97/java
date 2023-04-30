package day14.Block;

public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        Person person = new Person();
        Person.info();

    }
}

class  Person{
    String name;
    int age;
    static String desc="我是一个人";

    public Person(){

    }

    public Person (String name,int age){
        this.name = name;
        this.age = age;
    }

    static{
        System.out.println("hello,static block");
    }

    {
        System.out.println("hello ,block");
    }

    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static  void info(){
        System.out.println("我是一个快乐的人");
    }
}


