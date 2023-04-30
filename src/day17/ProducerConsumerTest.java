package day17;

/*
生产者将产品交给店员，而消费者从店员处取走产品，店员一次只能持有固定数量的产品，如果生产者试图生产更多的产品，店员会让生产者停一下，如果店中有
空位存放产品在通知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如果店中有产品了
在通知消费者取走产品

分析：
是否是多线程问题
是否有共享数据
是否有线程安全问题
是否需要处理线程安全
是否存在线程通信



*/

class Clerk{
    private  int productNum =0;

    //增加产品数量
    public synchronized  void addProduct(){
        if(productNum>=20){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else {
            productNum++;
            System.out.println(Thread.currentThread().getName()+"生产了第"+productNum+"个产品");
            // 唤醒
            notifyAll();
        }


    }

    public synchronized  void minusProduct(){
   
        if(productNum<=0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println(Thread.currentThread().getName()+"消费了了第"+productNum+"个产品");
            productNum--;
            // 唤醒
            notifyAll();
        }

        
    }
}

class Producer extends  Thread{
    private Clerk clerk;

    public Producer(Clerk clerk){
        this.clerk = clerk;

    }



    @Override
    public void run() {
        while (true){
            System.out.println("生产者开始生产产品");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addProduct();
        }
    }
}

class Consumer extends  Thread{
    private  Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk =clerk;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("消费者开始消费产品");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.minusProduct();
        }
    }
}


public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer producer = new Producer(clerk);
        Consumer consumer = new Consumer(clerk);
        producer.start();
        consumer.start();

    }
}
