package day15.impl;

public class USBTest {
    public static void main(String[] args) {
        // 接口的多态性
        Computer computer  =new Computer();
        // 创建接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        computer.transferData(flash);
//        创建接口的非匿名实现类的匿名对象
        computer.transferData(new Flash());
        //创建接口的匿名实现类的非匿名对象
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("");
            }

            @Override
            public void stop() {
                System.out.println("");
            }
        };
        computer.transferData(phone);
        //创建接口的匿名实现类的匿名对象
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("mp3");

            }

            @Override
            public void stop() {
                System.out.println("mp3");
            }
        });



    }

}


class Computer{
    public  void transferData(USB usb){
        usb.start();
        System.out.println("具体传输数据细节");
        usb.stop();
    }
}
interface USB
{

    void start();

    void stop();
}

class  Flash implements USB{
    @Override
    public void stop() {

    }

    @Override
    public void start() {

    }
}

class  Printer implements USB{
    @Override
    public void stop() {

    }

    @Override
    public void start() {

    }
}