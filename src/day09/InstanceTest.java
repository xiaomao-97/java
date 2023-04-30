package day09;

public class InstanceTest {
    public static void main(String[] args) {
        Phone p  = new Phone();
        System.out.println(p);
        p.sendEmail();
        // 匿名对象
        new Phone().sendEmail();
    }
}


class Phone{
    double price;

    public void sendEmail(){
        System.out.println("发送邮件");
    }

    public void playGame(){
        System.out.println("打游戏");
    }

}