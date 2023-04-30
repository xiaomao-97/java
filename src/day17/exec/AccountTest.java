package day17.exec;

import day12.java7.Person;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        Customer customer1 = new Customer(account,"甲");
        Customer customer2 = new Customer(account,"乙");
        customer2.start();
        customer1.start();
    }

}

class Account{
    private double balance;

    public synchronized void deposit(double amt){ //即为acct，是唯一的；deposit代表的是account的对象
        if (amt >0){
            balance += amt;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+"存钱10000块，余额为："+balance);
    }
}

class Customer extends  Thread{
    Account account;

    public Customer(Account account) {
        this.account = account;
    }

    public Customer(Account account,String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for(int i =0;i<=3;i++){

            account.deposit(1000);
        }

    }
}

