package day02;

public class VariableTest2 {
    /*
    八种数据类型之间的运算,其实只是七种，不包括bool类型
    1、自动类型提升 byte short int ,long,float,doub                     le
    2、强制类型转换
     */
    public static  void  main(String[] args){
        byte b1 =2;
        int i1 = 129;
        // 用数据类型更大的去接收
        int b2 = b1 + i1;
        System.out.println(b2);
        float f = b1 +i1;
        System.out.println(f);


    }
}
