package day12.java7;

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

        //如何才能调用子类持有的属性和方法
        Man man1= (Man) person1;
        man1.earnMoney();
        man1.isSmoking =true;
        // 使用强转的时候会出现classCastExceptpiton  -----使用instance of
//        Women women1 = (Women) person1;
//        women1.goShopping();
        if(person1 instanceof Man){
            System.out.println("*******Man*******");
        }

//        if(person1 instanceof Women){
//            System.out.println("**************");
//        }

        //





    }
}
