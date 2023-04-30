package day11.src.view;

import day11.src.bean.Customer;

public class Test {
    private int a = 1;
    private Customer[] customers;

    public Test(int total) {
        customers = new Customer[total];
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void b(){
        a =a+10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Test test =  new Test(5);
        test.b();
        System.out.println(test.a);
    }
}
