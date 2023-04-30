package day11.src.service;

import day11.src.bean.Customer;

public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    /**
     * 用来初始化customers数组的构造器,这样创建到CustomerList的时候会默认new数组
     *
     * @param total
     */
    public CustomerList(int total) {
        customers = new Customer[total];
    }

    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        }
        customers[total++] = customer;
        System.out.println(total);
        return true;
    }

    public boolean replaceCustomer(int index, Customer customer) {
        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = customer;
        return true;
    }

    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
//        customers[total -1] = null;
//        total --;
        customers[--total] = null;
        return true;
    }

    public Customer[] getAllCustomers() {
        Customer[] customers1 = new Customer[total];
        for (int i = 0; i < total; i++) {
            customers1[i] = customers[i];
        }
        return customers1;
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }

    public int getTotal() {
        return  total;

    }

}


