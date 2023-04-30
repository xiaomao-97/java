package day13.java2;

import day12.InterviewTest;
import org.junit.Test;

import javax.swing.text.StyledEditorKit;

public class WrapperTest {


    // 基本数据类型 ---->包装类:调用包装类的构造器
    @Test
    public void test1() {
        int num1 = 10;
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());
        System.out.println(in1);

        Integer in2 = new Integer("123");
        System.out.println(in2.toString());

        //异常
//        Integer in2 = new Integer("123abc");
//        System.out.println(in2.toString());
    }

    // 包装类装换为基本数据类型
    @Test
    public void test2() {
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1 + 1);

        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2 + 1);
    }

    // 自动装箱与拆箱  jdk5.0以后的版本
    @Test
    public void test3() {
        int num1 = 10;
        method(num1);

        // 自动装箱
        int num2 = 10;
        Integer in1 = num2;

        boolean b1 = true;
        Boolean b2 = b1; //自动装箱


        // 自动拆箱
        int num3 = in1;

    }

    public void method(Object obj) {


    }

    @Test
    public void test4(){
        int num1 = 10;
        String str1 = num1 +"";
        float f1 = 12.4f;
        String str2 = String .valueOf(f1);

        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str3);
    }



    // String 转换为基本数据类型和包装类
    @Test
    public void  test5(){
        String str1 = "123";
        int num2 = Integer.parseInt(str1);
        System.out.println(num2+1);

        String str2 = "true1";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
    }

}
