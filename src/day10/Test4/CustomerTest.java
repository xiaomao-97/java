package day10.Test4;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");
        Account account = new Account(1000,2000,0.0123);
        customer.setAccount(account);
        customer.getAccount().deposit(1000);
        System.out.println(customer.getAccount().getBalance());
        customer.getAccount().withdraw(1000);
        System.out.println(customer.getAccount().getBalance());

//        customer.getAccount().withdraw(2000);


    }
}
