package day10;


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
}
