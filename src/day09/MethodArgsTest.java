package day09;

public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest methodArgsTest = new MethodArgsTest();
        methodArgsTest.show("hello");
        methodArgsTest.show("hello","world");
    }


    public  void show(int i){

    }

//    public void show(String s){
//        System.out.println("一个参数");
//    }

    public void  show(String ... str){
        System.out.println("show string......");
    }

    public void show(String s){
        System.out.println("一个参数");
    }
}
