package chapter18.grammar;

import org.junit.Test;

import java.util.Comparator;

public class InstanceOfTest {

    @Test
    public void test1(){
        Object obj = new String("hello,java4");
        if (obj instanceof String){
            String str = (String) obj;
            System.out.println(str.contains("java"));
        }else{
            System.out.println("非string类型");
        }
    }


    @Test
    public void test2(){
        Object obj = new String("hello,java4");
        if (obj instanceof String  str){
            System.out.println(str.contains("java"));
        }else{
            System.out.println("非string类型");
        }
    }

}

class Computer{
    private String model;
    private double price;

//    // 方式1
//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Computer){
//            Computer other = (Computer) o;
//            if(this.model.equals(other.model)&& this.price==other.price){
//                return true;
//            }
//        }
//        return false;
//    }

    // 方式2
//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Computer other){
//            if(this.model.equals(other.model)&& this.price==other.price){
//                return true;
//            }
//        }
//        return false;
//    }

    // 方式3
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Computer other  && this.model.equals(other.model)&& this.price==other.price;
    }
}
