package day14;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        Account account1 = new Account("qwerty",2000);
        System.out.println(account1);
        System.out.println(account);
    }
}

class Account{
    private int id;
    private String pwd="000000";
    private double balance;

    private static double interestRate;
    private static double minMoney = 1.0;
    private static int init = 1001 ; //用于自动赋值

    //空参构造器的理解
    public Account() {
        id = init++;    //自动赋值
    }

    public Account(String pwd, double balance) {
        id = init++;
        this.pwd = pwd;
        this.balance = balance;
    }


}
