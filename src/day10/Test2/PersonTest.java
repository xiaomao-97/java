package day10.Test2;

public class PersonTest {
    public static void main(String[] args) {
        Person person =  new Person();
        person.setAge(32);
        System.out.println(person.getAge());
        person.eat();
    }

}



class Person{
    private String name;
    private int age;

    public Person(){

    }

    public Person(String name){
        this();
        this.name = name;
    }

    public Person(String name ,int age){
        this(name);
        this.name = name;
    }

    public void setAge(int age){
        this.age =age;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName(){
        return  name;
    }

    public void eat(){
        this.study();
        System.out.println("人吃饭");
    }

    public void study(){
        System.out.println("人学习");
    }
}
