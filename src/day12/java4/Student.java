package day12.java4;

public class Student extends Person {

    String major;
    int id;
    public Student(){
    }

    public Student(String major){
        this.major = major;
    }

    public Student(String name,int age, String major){
//        this.name =name;
//        this.age = age;
        super(name,age);
        this.major = major;
    }
    public void study(){

        System.out.println("学习专业是："+major);
        this.eat();
        super.eat();
    }

    public void eat(){
        System.out.println("学生要吃多有营养的地方");
    }

    public void show(){
        System.out.println("name="+this.name+"age="+this.age);
        System.out.println("id = "+id);
        System.out.println("id="+super.id) ;  //super调用父类的属性，显示的调用父类中的申明的属性或方法；当定义同名属性的时候，子类调用父类
    }

}
