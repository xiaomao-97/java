package day17.synchronize.runnable;




class  SaleTicket implements  Runnable{
    int ticket =100;
    Object object = new Object();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
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
        SaleTicket1 saleTicket1 = new SaleTicket1();
        Thread thread1 = new Thread(saleTicket1);
        Thread thread2 = new Thread(saleTicket1);
        Thread thread3 = new Thread(saleTicket1);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
