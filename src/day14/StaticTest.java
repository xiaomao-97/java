package day14;

public class StaticTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 40;
        c1.nation = "CHN";


        Chinese c2 = new Chinese();
        c2.name = "马龙";
        c2.age=35;
        c2.nation = "CHINA";


        System.out.println(c1.nation);
        Chinese.show();

    }
}

class Chinese {
    String name;
    int age;
    static String nation;

    public static  void  show(){
        System.out.println("我的是一个中国人");
    }


}
