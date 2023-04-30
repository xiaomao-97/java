package day10.Test5;

public class Account {
    private  double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void withdraw(double amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println("成功取出" + amount);
        }else {
            System.out.println("取钱失败");
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("成功存入"+amount);
        }
    }
}
