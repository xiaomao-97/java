package day17.runnable;

public class EvenNumberPrint implements  Runnable{
    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}

class  EvenNumberTest{
    public static void main(String[] args) {
        EvenNumberPrint p = new EvenNumberPrint();
        Thread t1 = new Thread(p);
        t1.start();

        // 在main中执行的方式
        for(int i=1;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }

        // 在创建一个线程，用于遍历100以内的偶数
        Thread t2 = new Thread(p);
        t2.start();

    }
}
