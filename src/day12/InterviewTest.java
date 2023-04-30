package day12;

public class InterviewTest {
    public static void main(String[] args) {
        Base base = new Sub();
        base.add(1,2,3);   //父类重写方法

        Sub s = (Sub) base;
        s.add(1,2,3);   //强转变成子类的方法
    }
}

class Base{
    public void add(int a ,int ... arr){
        System.out.println("base1");
    }
}

class Sub extends  Base{
    public void add(int a,int[] arr){
        System.out.println("sub_1");
    }

    public void add(int a,int b ,int c){
        System.out.println("sub_2");
    }


}

