package day15;

public interface CompareA {
    public  static void method1(){
        System.out.println("compare 北京");
    }

    public default void method2(){
        System.out.println("compareA ：上海");
    }
}
