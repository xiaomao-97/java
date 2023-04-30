package day10.Test3;

public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("罗密欧",21);
        boy.shout();
        Girl girl = new Girl("朱丽叶",20);
        girl.marry(boy);
        Girl girl1 = new Girl("祝英台",18);
        int compare = girl.compare(girl1);
        System.out.println(compare);

    }
}
