package day13;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();

        Man man = new Man();
        man.eat();
        man.age =25;
        man.earnMoney();

        //对象的多态性：父类的引用指向子类的对象
        Person person1 = new Man();
        // 多态的使用
        person1.eat();


    }
}
