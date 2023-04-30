package day14.SingletonTest;

public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);
    }
}


//饿汉式
class Bank{

    //私有化类的构造器
    private Bank(){

    }

    //内部创建类的对象
    //要求此对象的也必须声明为静态的
    private static  Bank instance = new Bank();

    // 提供公共的静态方法，返回类的对象
    public static Bank getInstance(){
        return  instance;
    }



}
