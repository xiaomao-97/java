package day10.Test5;

import day10.Test4.Customer;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank(){
        this.customers = new Customer[10];
    }

    public void addCustomer(String f,String l){
        Customer cust = new Customer(f,l);
        this.customers[numberOfCustomers] = cust;
        numberOfCustomers++;

    }

    public int getNumberOfCustomers(){
        return  numberOfCustomers;
    }

    public Customer getCustomer(int index){
        if(index >=0 && index <numberOfCustomers){
            return customers[index];
        }
        return null;
    }


}
