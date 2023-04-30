package day10.Test1;


public class Person {

    private int age;

    public void setAge(int a){
        if (a<0||a>130){
            System.out.println("传入的非法");
        }
        age  = a;
    }

    public int getAge(){
        return  age;
    }

    public Person(){}

    public  Person(int n){
        age =n;
    }

    public void eat(){
        System.out.println("人吃饭");
    }
}
