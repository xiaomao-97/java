package day08;

public class CustomerTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.sleep(8);
    }

}

class  Customer{
    String name;
    int age;
    boolean isMale;

    public void eat(){
        System.out.println("客户吃饭");
    }

    public void sleep(int hour){
        System.out.println("客户休息了"+hour+"个小时");
        eat();
    }

    public String getName(){
        return name;
    }

    public String getNation(String nation){
        String info  = "我的国籍"+nation;
        System.out.println(info);
        return  info;
    }
}
