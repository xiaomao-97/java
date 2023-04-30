package day17.synchronize.thread;


class Window extends Thread{
    static  int ticket =100;
    static Object obj = new Object();

    @Override
    public void run() {
        while(true){
            synchronized (Window1.class){
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "售票，票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}



public class WindowTest {
    public static void main(String[] args) {
        Window1 window1 = new Window1();
        Window1 window12 = new Window1();
        Window1 window13 = new Window1();
        window1.setName("窗口1");
        window12.setName("窗口2");
        window13.setName("窗口3");
        window1.start();
        window12.start();
        window13.start();


    }




}

