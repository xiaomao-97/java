package day12.java5;

public class Account {
    private int id;
    private double balance;
    private double annualInterstRate;


    public Account(int id, double balance, double annualInterstRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterstRate = annualInterstRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterstRate() {
        return annualInterstRate;
    }

    public void setAnnualInterstRate(double annualInterstRate) {
        this.annualInterstRate = annualInterstRate;
    }

    public double getMonthlyInterst(){
        return annualInterstRate/12;
    }

    public void  withdraw(double amount){
        if(balance>=amount){
            balance -= amount;
            return;
        }
        System.out.println("余额不足");
    }

    public void deposit(double amount){
        if(amount >=0){
            balance +=amount;
        }
    }

}
