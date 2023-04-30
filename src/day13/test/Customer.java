package day13.test;

import java.util.Objects;

public class Customer {
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer() {
    }

    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public Customer(String name,int age){
        this.name = name;
        this.age = age;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj){
//            return  true;
//        }
//        if(obj instanceof Customer){
//            Customer cust = (Customer) obj;
////            if(this.age ==cust.age&&this.name.equals(cust.name)){
////                return  true;
////            }else{
////                return  false;
////            }
//
//            return this.age ==cust.age&&this.name.equals(cust.name);
//
//        }
//        return  false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return gender == customer.gender && age == customer.age && Objects.equals(name, customer.name) && Objects.equals(phone, customer.phone) && Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age, phone, email);
    }
}
