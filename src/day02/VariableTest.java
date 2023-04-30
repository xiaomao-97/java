package day02;/*
变量必须先声明
变量都定义在在同一个作用域中，即同一个方法中
不可以在同一个作用域内定义同名的变量
 */

public class VariableTest {
    public  static  void main(String[] args){
        int myAge = 12;
        System.out.println(myAge);
    }
    public void method(){
        int myclass  =  1;
    }
}
