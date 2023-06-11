package day29.example;

import java.io.Serializable;

public class Person implements Serializable {
    static final long serialVersionUID = 424543232L;

    String name;

    public int age;

    private static String info;

    public Person() {
    }

    public void show() {
        System.out.print("開始調用");
    }


    public Person(String name) {
        this.name = name;
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    private String showNation(String nation) {
        System.out.println("df");
        return nation;
    }

    public static void showInfo(){
        System.out.println("df");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
