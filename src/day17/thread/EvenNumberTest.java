package day17.thread;

public class EvenNumberTest {
    public static void main(String[] args) {
        PrintNumber t1 = new PrintNumber();
        t1.start();
         
    }
}

class PrintNumber extends Thread{

    @Override
    public void run() {
        for (int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        // 提供了Runable接口匿名实现类的匿名对象
        new Thread(){
            @Override
            public void run() {
                for(int i=1;i<100;i++){
                    if(i%2==0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<100;i++){
                    if(i%2==0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<100;i++){
                    if(i%2!=0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }).start();

    }
}
