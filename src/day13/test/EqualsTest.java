package day13.test;

public class EqualsTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        double k = 10.0;
        char m =10;
        System.out.println(i==j);//true
        System.out.println(i==k);//true
        System.out.println(i==m) ; //true


        Customer customer = new Customer("tom",21);
        Customer customer1 = new Customer("tom",21);
        System.out.println(customer.equals(customer1));  // 需要重写custmer中的方法


    }


}
