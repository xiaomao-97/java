package day12.java5;

public class AccountTest {
    public static void main(String[] args) {
        Account account =new Account(1122,20000,0.45);
        account.withdraw(3000);
        System.out.println("您的账号余额为"+account.getBalance());
        account.withdraw(2500);
        System.out.println("您的账号余额为"+account.getBalance());
        account.deposit(3000);
        System.out.println("您的账号余额为"+account.getBalance());


        System.out.println("月利率"+account.getMonthlyInterst());

    }
}
