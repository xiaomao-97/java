package day10.Test5;

import day10.Test4.Account;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("jane","smith");
        bank.getCustomer(0).setAccount( new Account(1000,2000,0.0123));
        bank.getCustomer(0).getAccount().withdraw(500);
        double balance = bank.getCustomer(0).getAccount().getBalance();
        System.out.println("balance is "+balance);
    }
}
