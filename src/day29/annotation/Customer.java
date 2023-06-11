package day29.annotation;

@Table(value = "t_customer")
public class Customer {
    @Column(columnName = "cust_name",columnType = "varchar(15")
    private String name;
    @Column(columnName = "cust_age",columnType = "int")
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Customer() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
